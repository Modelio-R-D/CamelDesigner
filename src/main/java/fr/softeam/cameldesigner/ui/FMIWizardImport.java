package fr.softeam.cameldesigner.ui;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.modelio.model.ITransaction;

/**
 * This class provides the XMI import dialog
 * @author ebrosse
 */
@objid ("c061a0af-d743-4c2b-b2ce-1a0942fcb952")
public class FMIWizardImport extends AbstractSwtWizardWindow {
    @objid ("b0fa43d9-4486-4c3a-858f-3ce32f088e66")
    private CamelFormat format = CamelFormat.XMI;

    @objid ("fe0a5cd2-8b59-4312-92d6-a7b050077e2d")
    private Group formatGroup = null;

    @objid ("638dd21f-1b97-421e-822a-de97f90cc2a7")
    private Button flatButton = null;

    @objid ("61fd91d4-a6c0-4e43-870d-b6944a7b5d56")
    private Button structButton = null;

    @objid ("b186cada-52d8-48ca-8e2d-326b878f7a95")
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
        fd_fileChooserComposite.bottom = new FormAttachment(0, 30);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FMIWizardImport.this.fileChooserComposite.searchFile();
            }
        });
        
        this.formatGroup = new Group(this.shell,  SWT.NONE);
        this.formatGroup.setToolTipText("Import Format");
        this.formatGroup.setText("Import Format");
        
        final FormData fd_formatChooserComposite = new FormData();
        fd_formatChooserComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_formatChooserComposite.bottom = new FormAttachment(this.fileChooserComposite, 50, SWT.BOTTOM);
        fd_formatChooserComposite.left = new FormAttachment(this.fileChooserComposite, 5, SWT.LEFT);
        fd_formatChooserComposite.right = new FormAttachment(this.fileChooserComposite, -5, SWT.RIGHT);
        this.formatGroup.setLayoutData(fd_formatChooserComposite);
        
        final RowLayout fd_groupExtension = new RowLayout(2);
        fd_groupExtension.fill = true;
        fd_groupExtension.marginLeft = 30;
        fd_groupExtension.marginRight = 30;
        fd_groupExtension.justify = true;
        fd_groupExtension.type = SWT.HORIZONTAL;
        
        this.formatGroup.setLayout(fd_groupExtension);
        
        this.flatButton = new Button(this.formatGroup, SWT.RADIO);
        
        final RowData fd_xmi = new RowData();
        fd_xmi.height = 25;
        this.flatButton.setLayoutData(fd_xmi);
        
        this.flatButton.setText(CamelFormat.XMI.toString());
        this.flatButton.setSelection(true);
        this.flatButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                FMIWizardImport.this.format = CamelFormat.XMI;
                FMIWizardImport.this.structButton.setSelection(false);
                FMIWizardImport.this.flatButton.setSelection(true);
            }
        });
        
        this.structButton = new Button(this.formatGroup, SWT.RADIO);
        final RowData fd_uml = new RowData();
        fd_uml.height = 25;
        this.structButton.setLayoutData(fd_uml);
        this.structButton.setText(CamelFormat.Camel.toString());
        this.structButton.setSelection(false);
        this.structButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                FMIWizardImport.this.format = CamelFormat.Camel;
                FMIWizardImport.this.flatButton.setSelection(false);
                FMIWizardImport.this.structButton.setSelection(true);
            }
        });
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.formatGroup, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.formatGroup, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.formatGroup, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(400, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    @objid ("d0ac7988-6d32-4434-aca4-6b4981eec362")
    @Override
    public void validationAction() {
        File theFile = getFileChooserComposite().getCurrentFile();
        
        String extension = theFile.getName();
        extension = extension.substring(extension.lastIndexOf("."));
        
        if (theFile.exists() && theFile.isFile()) {
        
            if (extension.equals(".xml")) {
        
                try(ITransaction t = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().createTransaction("Import") ) {
        
        //                    MDImporter importer = new MDImporter();
        //                    importer.importMD((Package) this.selectedElt, theFile, this.format);
        
                    t.commit();
        
                    completeBox();
        
        
                } catch (final Exception e) {
                    CamelDesignerModule.logService.error(e);
                }
            }
        } else {
            fileDontExist();
        }
    }

    @objid ("2e42aaaf-b14c-4776-bf68-85340c89fe42")
    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("description");
        setFrametitle("Import");
        setCancelButton("Cancel");
        setValidateButton("Import");
    }

    @objid ("7cf42438-8456-4ccb-829f-818bbabedd1b")
    @Override
    public void setPath() {
        try {
            if (this.path.equals(""))
                this.path = CamelDesignerModule.getInstance().getModuleContext().getProjectStructure().getPath().toAbsolutePath().toString();
        
            this.fileChooserComposite.getDialog().setFilterPath(this.path);
            this.fileChooserComposite.getDialog().setFileName("");
            this.fileChooserComposite.setText(this.path);
        } catch (@SuppressWarnings ("unused") final NoClassDefFoundError e) {
            this.fileChooserComposite.setText("");
        }
    }

    @objid ("24bac2d0-732b-447a-8c32-b7b25e912357")
    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { "FMU Files (*.fmu), XML Files (*.xml)" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] {  "*.fmu; *.xml" });
        setPath();
    }

    /**
     * @param style : the SWT style
     * 
     * @param parent : the parent shell
     */
    @objid ("8f381967-05c7-4df1-89ab-b71843ee9993")
    public FMIWizardImport(final Shell parent) {
        super(parent);
    }

    @objid ("afaf252c-8823-40fd-9e05-f70df8fc7d5d")
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

}
