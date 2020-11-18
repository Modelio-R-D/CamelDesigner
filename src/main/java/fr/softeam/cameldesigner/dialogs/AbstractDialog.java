package fr.softeam.cameldesigner.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public abstract class AbstractDialog extends Dialog {
    protected static final int DEFAULT_MARGIN = 20;

    protected String dialogText = "Dialog Text";

    protected Button cancelButton;

    protected Button okButton;

    protected ModelElement selectedElement;

    protected Shell shell;

    protected GridLayout gridLayout;

    private AbstractDialog(Shell parent, int style, ModelElement selectedElement) {
        super (parent, style);
        this.selectedElement = selectedElement;
    }

//    private AbstractDialog(Shell activeShell, ModelElement selectedElement) {
//        this (activeShell, SWT.NONE, selectedElement);
//    }
    public AbstractDialog(ModelElement selectedElement) {
        this (Display.getCurrent().getActiveShell(), SWT.NONE, selectedElement);
    }

    public void setDialogText(String dialogText) {
        this.dialogText = dialogText;
    }

    public void setSelectedElement(ModelElement selectedElement) {
        this.selectedElement = selectedElement;
    }

    public void open() {
        Shell parent = getParent();
        Display display = parent.getDisplay();
        
        this.shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
        
        
        this.shell.setText(this.dialogText);
        this.shell.setLocation(parent.getBounds().x + (parent.getBounds().width/2), parent.getBounds().y + (parent.getBounds().height/2));
        // Layout with 2 columns
        this.gridLayout = new GridLayout(12, false);
        this.shell.setLayout(this.gridLayout);
        
        this.gridLayout.marginTop = DEFAULT_MARGIN/2;
        this.gridLayout.marginRight = DEFAULT_MARGIN;
        this.gridLayout.marginLeft = DEFAULT_MARGIN;
        this.gridLayout.marginBottom = DEFAULT_MARGIN/2;
        this.gridLayout.verticalSpacing = DEFAULT_MARGIN/2;
        
              
        
        dialogContentRows();
        
        
        
        // last row
        //  --> Cancel Button
        this.cancelButton = new Button(this.shell, SWT.PUSH);
        this.cancelButton.setText("Cancel");
        GridData cancelGridData = new GridData();
        //cancelGridData.horizontalAlignment = GridData.BEGINNING;
        cancelGridData.widthHint = 100;
        this.cancelButton.setLayoutData(cancelGridData);
        this.cancelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                AbstractDialog.this.shell.close();
            }
        });
        
        //  --> OK Button
        this.okButton = new Button(this.shell, SWT.PUSH);
        this.okButton.setText("OK");
        GridData okGridData = new GridData();
        //okGridData.horizontalAlignment = GridData.END;
        okGridData.widthHint = 100;
        this.okButton.setLayoutData(okGridData);
        this.okButton.addSelectionListener(new SelectionAdapter() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                AbstractDialog.this.okAction(e);
            }
        
        });
        
        this.shell.pack();
        
        this.shell.open();
        
        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
    }

    protected abstract void dialogContentRows();

    protected abstract void okAction(SelectionEvent e);

}
