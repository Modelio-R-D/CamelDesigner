/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 *
 */


package fr.softeam.cameldesigner.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.ui.composite.NameComposite;
import fr.softeam.cameldesigner.ui.composite.ValidationBoutonComposite;

/**
 * @author ebrosse
 */
public abstract class FileWizardWindow extends Dialog {

    private String title = "";

    private String description = "";

    private String frametitle = "";

    private String cancelButton = "";

    private String validateButton = "";

    private static boolean cancelation = false;

    protected boolean error = false;

    protected String path = "";

    protected ModelElement selectedElt = null;

    protected Shell shell = null;

    protected NameComposite nameComposite = null;

    private ValidationBoutonComposite validateComposite = null;


    /**
     * @return nothing
     */
    public Object open() {
        setCancellation(false);
        createContents();
        Display display = getParent().getDisplay();
        centerOnPrimaryScreen(display);
        this.shell.open();
        this.shell.layout();

        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        return null;
    }

    protected void createContents() {
        setLabels();

        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout( new FormLayout());
        this.shell.setText(this.frametitle);

        // File chooser composite
        this.nameComposite = new NameComposite(this.shell, SWT.NONE, SWT.OPEN);


        // Validation Composite
        this. validateComposite = new ValidationBoutonComposite(this.shell, SWT.NONE, this.cancelButton, this.validateButton);

        this.validateComposite.getValidationButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	validationAction();
            }
        });


        this.validateComposite.getCancelButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setCancellation(true);
                cancelAction();
            }
        });

        final FormData fd_fileChooserComposite = new FormData();
        fd_fileChooserComposite.right = new FormAttachment(100, 0);
        fd_fileChooserComposite.bottom = new FormAttachment(0, 50);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.nameComposite.setLayoutData(fd_fileChooserComposite);

        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.nameComposite, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.nameComposite, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.nameComposite, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);

        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(this.shell.getBounds().width, this.shell.getBounds().height));

        this.validateComposite.getValidationButton().setFocus();
    }

    /**
     * set default configuration of the dialog box
     */
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    public MObject getSelectedElt() {
        return this.selectedElt;
    }

    void cancelAction() {

        if ((this.shell != null) && (!this.shell.isDisposed())){
            this.shell.dispose();
        }
    }


    /**
     * @param cancelButton : the text of the cancel button
     */
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }


    /**
     * Warning user that he does not select a file
     */
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    public static boolean isCancelation() {
        return FileWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    public static void setCancellation(final boolean cancelation) {
        FileWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    public abstract void validationAction();

    /**
     * set button labels
     */
    public abstract void setLabels();

    /**
     * initialize file path
     */
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage("Specified File do not exist");
        messageBox.open();
    }


    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    public FileWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    public FileWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    public void setSelectedElt(final ModelElement selectedElt) {
        this.selectedElt = selectedElt;
    }

    private void centerOnPrimaryScreen(Display display) {
        Monitor primary = display.getPrimaryMonitor();
        Rectangle bounds = primary.getBounds();
        Rectangle rect = this.shell.getBounds();
        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;
        this.shell.setLocation(x, y);
        this.shell.open();
    }


    /**
     * @param inpath : the initial path
     * @return the same path in a correct form
     */
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

    protected void completeBox() {
        this.title = "Complete";

        this.description = "Complete";


        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_INFORMATION);
                FileWizardWindow.this.shell.dispose();
            }
        });
    }

    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(this.shell, icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

}
