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
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.module.IModule;

/**
 * This class provides the FMI export dialog
 * @author ebrosse
 */
@objid ("8550ba3c-6dcb-48f4-a687-6623cee74bbe")
public class FMIWizardExport extends AbstractSwtWizardWindow {
    @objid ("85c32062-a5ad-4161-a63e-c21752f9a6e8")
    private IModule module = null;

    @objid ("fc3cfaba-1743-40cc-ad36-e3f4eebfb40d")
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

    @objid ("5b4807d7-2103-4f45-bf8a-78dfd61191ce")
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
        fd_fileChooserComposite.bottom = new FormAttachment(0, 50);
        fd_fileChooserComposite.top = new FormAttachment(0, 0);
        fd_fileChooserComposite.left = new FormAttachment(0, 0);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.fileChooserComposite, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.fileChooserComposite, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                FMIWizardExport.this.fileChooserComposite.searchFile();
            }
        });
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(this.shell.getBounds().width, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    @objid ("9e412dc7-a919-462a-9c0c-ff7deb3a3bd7")
    public FMIWizardExport(Shell parent, IModule module) {
        super(parent);
        this.module = module;
    }

    @objid ("959b0b88-f626-4efb-8bb3-af035726bde6")
    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("Description");
        setFrametitle("ModelDescription Export");
        setCancelButton("Cancel");
        setValidateButton("Export");
    }

    @objid ("c578e08c-f384-45ed-95f1-001b1a4c952c")
    @Override
    public void validationAction() {
        File generatedMD = getFileChooserComposite().getCurrentFile();
        this.path = generatedMD.getParent();
        
        if (!generatedMD.getParentFile().exists()){
            generatedMD.getParentFile().mkdirs();
        }
        
        try {
        //            //Export model description
        //            MDExporter exporter = new MDExporter();
        //            exporter.exportFMI((Class) this.selectedElt, generatedMD);
        
        
            //Complete
            completeBox();
        
        } catch (Exception e) {
            CamelDesignerModule.logService.error(e);
        }
    }

    @objid ("e7ac663c-e7e0-481f-8d98-9b1b62e89c80")
    @Override
    public void setPath() {
        if (this.path.equals(""))
            this.path = this.module.getModuleContext().getProjectStructure().getPath().toAbsolutePath().toString();
        
        String fileName = this.selectedElt.getName() + ".modelDescription.xml";
        this.fileChooserComposite.getDialog().setFilterPath(this.path);
        this.fileChooserComposite.getDialog().setFileName(fileName);
        this.path = checkAndReplaceEndPath(this.path);
        this.fileChooserComposite.setText(this.path + java.io.File.separator + fileName);
    }

    @objid ("8e2ad3f2-d74e-4b86-a104-efc37520c128")
    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { "XMI Files", "Camel" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.xmi", "*.camel" });
        setPath();
    }

}
