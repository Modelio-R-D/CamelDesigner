package fr.softeam.cameldesigner.ui;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.AbstractImporterService;
import fr.softeam.cameldesigner.exchange.importer.CamelImporterService;
import fr.softeam.cameldesigner.exchange.importer.XMIImporterService;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import fr.softeam.cameldesigner.ui.composite.FileChooserComposite;
import fr.softeam.cameldesigner.ui.composite.ValidationBoutonComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.modelio.model.ITransaction;

/**
 * This class provides the Camel export dialog
 * @author ebrosse
 */
@objid ("37678874-beb8-4275-8031-d9364197e632")
public class WizardImport extends AbstractSwtWizardWindow {
    @objid ("60740ef0-15b0-4759-8c52-f220b48c041a")
    private void createContents() {
        setLabels();
        
        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout( new FormLayout());
        this.shell.setText(this.frametitle);
        
        // File chooser composite
        this.fileChooserComposite = new FileChooserComposite(this.shell, SWT.NONE, SWT.OPEN);
        
        // Validation Composite
        this. validateComposite = new ValidationBoutonComposite(this.shell, SWT.NONE, this.cancelButton, this.validateButton);
        
        this.validateComposite.getValidationButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        
                if (getFileChooserComposite().getCurrentFile() != null) {
                    validationAction();
                } else {
                    selectAFile();
                }
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
        fd_fileChooserComposite.bottom = new FormAttachment(0, 40);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.fileChooserComposite, 5, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.fileChooserComposite, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                WizardImport.this.fileChooserComposite.searchFile();
            }
        });
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(this.shell.getBounds().width, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    @objid ("f8c4dc8a-bb2b-4a2a-b6e1-46c69bdccd62")
    @Override
    public void validationAction() {
        File theFile = getFileChooserComposite().getCurrentFile();
        
        if (theFile.exists() && theFile.isFile()) {
        
            try(ITransaction t = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().createTransaction("Import") ) {
        
                AbstractImporterService importerService = null;
        
                if (theFile.getAbsolutePath().endsWith(".xmi")) {
                    importerService = new XMIImporterService();
                }else {
                    importerService = new CamelImporterService();
                }
        
                importerService.importFromFile(this.selectedElt, theFile.getAbsolutePath());
        
                t.commit();
                completeBox();
        
        
            } catch (final Exception e) {
                CamelDesignerModule.logService.error(e);
            }
        
        } else {
            fileDontExist();
        }
    }

    @objid ("7163ce32-3a40-40e1-824f-97dd1c40800c")
    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("Description");
        setFrametitle("Model import");
        setCancelButton("Cancel");
        setValidateButton("Import");
    }

    @objid ("c3e57f1b-1562-47e0-8d20-a6e654788799")
    @Override
    public void setPath() {
        try {
            this.fileChooserComposite.getDialog().setFilterPath("");
            this.fileChooserComposite.getDialog().setFileName("");
            this.fileChooserComposite.setText(this.path);
        } catch (@SuppressWarnings ("unused") final NoClassDefFoundError e) {
            this.fileChooserComposite.setText("");
        }
    }

    @objid ("4855c49e-cf0f-4bf9-8919-f5730a3666e2")
    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { "All Files (*.camel, *.xmi)", "Camel Files (*.camel)", "XMI Files (*.xmi)" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.camel; *.xmi", "*.camel", "*.xmi" });
        setPath();
    }

    @objid ("9ff35046-9d73-4ac8-a952-7adad1da0c4c")
    public WizardImport(Shell parent) {
        super(parent);
    }

    @objid ("9a3567ec-bec5-402f-85ba-fbee04e721de")
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

}
