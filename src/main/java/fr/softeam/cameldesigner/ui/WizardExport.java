package fr.softeam.cameldesigner.ui;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.exporter.AbstractExporterService;
import fr.softeam.cameldesigner.exchange.exporter.CamelExporterService;
import fr.softeam.cameldesigner.exchange.exporter.XMIExporterService;
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
import org.modelio.api.module.IModule;

/**
 * This class provides the Camel export dialog
 * @author ebrosse
 */
@objid ("f7e02f20-e3d1-4583-bce2-d34bf99e0904")
public class WizardExport extends AbstractSwtWizardWindow {
    @objid ("837f27a3-88b6-4657-be6c-92749ec6fbd7")
    private CamelFormat _format = CamelFormat.XMI;

    @objid ("efba16a2-2069-4522-8ed7-bcdf41302338")
    private Group _formatGroup = null;

    @objid ("4433cf67-4001-4161-9070-ea1e3e031d7f")
    private Button _XMIButton = null;

    @objid ("80dafdeb-e57f-4bb4-aa41-2510dc6da96e")
    private Button _CamelButton = null;

    @objid ("134e9f04-061c-4274-adef-38dbd852ff5d")
    private IModule _module = null;

    @objid ("cc230f2b-54a5-4887-933c-312f31002d54")
    @Override
    public Object open() {
        createContents();
        return super.open();
    }

    @objid ("e1f5dd81-131a-413c-bd4f-6571bca496ef")
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
                WizardExport.this.fileChooserComposite.searchFile();
            }
        });
        
        this._formatGroup = new Group(this.shell,  SWT.NONE);
        this._formatGroup.setToolTipText("Export Format");
        this._formatGroup.setText("Export Format");
        
        final FormData fd_formatChooserComposite = new FormData();
        fd_formatChooserComposite.top = new FormAttachment(this.fileChooserComposite, 5);
        fd_formatChooserComposite.bottom = new FormAttachment(this.fileChooserComposite, 50, SWT.BOTTOM);
        fd_formatChooserComposite.left = new FormAttachment(this.fileChooserComposite, 5, SWT.LEFT);
        fd_formatChooserComposite.right = new FormAttachment(this.fileChooserComposite, -5, SWT.RIGHT);
        this._formatGroup.setLayoutData(fd_formatChooserComposite);
        
        final RowLayout fd_groupExtension = new RowLayout(2);
        fd_groupExtension.fill = true;
        fd_groupExtension.marginLeft = 30;
        fd_groupExtension.marginRight = 30;
        fd_groupExtension.justify = true;
        fd_groupExtension.type = SWT.HORIZONTAL;
        
        this._formatGroup.setLayout(fd_groupExtension);
        
        this._XMIButton = new Button(this._formatGroup, SWT.RADIO);
        
        final RowData fd_xmi = new RowData();
        fd_xmi.height = 25;
        this._XMIButton.setLayoutData(fd_xmi);
        
        this._XMIButton.setText(CamelFormat.XMI.toString());
        this._XMIButton.setSelection(true);
        this._XMIButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                WizardExport.this._format = CamelFormat.XMI;
                WizardExport.this._CamelButton.setSelection(false);
                WizardExport.this._XMIButton.setSelection(true);
                WizardExport.this.fileChooserComposite.setText(WizardExport.this.fileChooserComposite.getText().replace(".camel", ".xmi"));
                WizardExport.this.fileChooserComposite.getDialog().setFilterNames(new String[] { "XMI Files (*.xmi)" });
                WizardExport.this.fileChooserComposite.getDialog().setFilterExtensions(new String[] {  "*.xmi" });
            }
        });
        
        this._CamelButton = new Button(this._formatGroup, SWT.RADIO);
        final RowData fd_uml = new RowData();
        fd_uml.height = 25;
        this._CamelButton.setLayoutData(fd_uml);
        this._CamelButton.setText(CamelFormat.Camel.toString());
        this._CamelButton.setSelection(false);
        this._CamelButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                WizardExport.this._format = CamelFormat.Camel;
                WizardExport.this._XMIButton.setSelection(false);
                WizardExport.this._CamelButton.setSelection(true);
                WizardExport.this.fileChooserComposite.setText(WizardExport.this.fileChooserComposite.getText().replace(".xmi", ".camel"));
                WizardExport.this.fileChooserComposite.getDialog().setFilterNames(new String[] { "Camel Files (*.camel)" });
                WizardExport.this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.camel" });
            }
        });
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this._formatGroup, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this._formatGroup, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this._formatGroup, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(400, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    /**
     * @param style : the SWT style
     * 
     * @param parent : the parent shell
     */
    @objid ("a7600a3c-2a9a-4c49-ad8a-c0cc6321e853")
    public WizardExport(final Shell parent, final IModule module) {
        super(parent);
        this._module = module;
    }

    @objid ("d962a282-45b5-43d0-8ed9-19d1b4879364")
    @Override
    public void setLabels() {
        setTitle("Title");
        setDescription("description");
        setFrametitle("Camel Export");
        setCancelButton("Cancel");
        setValidateButton("Export");
    }

    @objid ("121c63b4-afc6-4e75-a82a-b969651992f0")
    @Override
    public void validationAction() {
        try {
            File dest = getFileChooserComposite().getCurrentFile();
            this.path = dest.getParent();
        
            if (!dest.getParentFile().exists()){
                dest.getParentFile().mkdirs();
            }
        
            AbstractExporterService exporterService = null;
        
            if (this._format.equals(CamelFormat.XMI)){
                exporterService = new XMIExporterService();
            }else {
                exporterService = new CamelExporterService();
            }
            fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel rootProxy = fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.instantiate(this.selectedElt);
            exporterService.exportCamelUMLModelToFile(rootProxy, dest.getAbsolutePath());
        
            //Complete
            completeBox();
        }catch (Exception e) {
            CamelDesignerModule.logService.error(e);
            errorBox(e.getMessage());
        }
    }

    @objid ("d2297878-f3a3-4e42-acbf-958cfbdf0e7b")
    @Override
    public void setPath() {
        if (this.path.equals(""))
            this.path = this._module.getModuleContext().getProjectStructure().getPath().toAbsolutePath().toString();
        
        String fileName = this.selectedElt.getName() + ".xmi";
        this.fileChooserComposite.getDialog().setFilterPath(this.path);
        this.fileChooserComposite.getDialog().setFileName(fileName);
        this.path = checkAndReplaceEndPath(this.path);
        this.fileChooserComposite.setText(this.path + java.io.File.separator + fileName);
    }

    @objid ("f2458c44-42b2-430d-8ae5-648be3f72a41")
    @Override
    public void setDefaultDialog() {
        this.fileChooserComposite.getDialog().setFilterNames(new String[] { "XMI Files (*.xmi)" });
        this.fileChooserComposite.getDialog().setFilterExtensions(new String[] {  "*.xmi" });
        setPath();
    }

}
