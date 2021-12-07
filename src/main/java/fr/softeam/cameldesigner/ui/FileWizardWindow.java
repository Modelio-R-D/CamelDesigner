package fr.softeam.cameldesigner.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.ui.composite.NameComposite;
import fr.softeam.cameldesigner.ui.composite.ValidationBoutonComposite;
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

/**
 * @author ebrosse
 */
@objid ("77956138-29c0-4df4-8504-c345809b086b")
public abstract class FileWizardWindow extends Dialog {
    @objid ("3209cf4c-086d-41e9-b352-068eef6a5dcd")
    private String title = "";

    @objid ("90d05fb1-a412-4ed0-bc98-ea66b5346b8f")
    private String description = "";

    @objid ("33aa6000-6b8f-4882-a594-539dfdb3603d")
    private String frametitle = "";

    @objid ("5286c1d3-b03d-4a3c-9cc0-aa46524fa238")
    private String cancelButton = "";

    @objid ("3fb2b540-de5e-4893-a0f2-5522188dab87")
    private String validateButton = "";

    @objid ("6b0d3592-17f6-4cb7-948c-e06f1c0a585f")
    private static boolean cancelation = false;

    @objid ("6214b27e-c571-4e43-a72f-9128232bf2fe")
    protected boolean error = false;

    @objid ("141bb1f2-cee9-4618-afe5-363a73d3cb23")
    protected String path = "";

    @objid ("929bf490-5701-4b7f-b1bf-b66ab6a64b9e")
    protected ModelElement selectedElt = null;

    @objid ("e5265308-23fa-4c1e-9dbc-64deada8ea41")
    protected Shell shell = null;

    @objid ("2a28755d-e901-454f-9d92-39f6a962d4dd")
    protected NameComposite nameComposite = null;

    @objid ("cff2ee2a-de23-4600-8c00-95f339d72359")
    private ValidationBoutonComposite validateComposite = null;

    @objid ("a19e2c32-b4da-4704-80f6-d16b9927f754")
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

    @objid ("9199105e-c792-4a66-a433-434f8f82c3fa")
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
    @objid ("1bb54c0c-aab7-4ee1-aa66-0eb9c66d96b0")
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    @objid ("e25dc33b-b47f-49f1-b741-2d032538da2f")
    public MObject getSelectedElt() {
        return this.selectedElt;
    }

    @objid ("ac15ced0-075e-4480-b642-5727ecf51e8f")
    void cancelAction() {
        if ((this.shell != null) && (!this.shell.isDisposed())){
            this.shell.dispose();
        }
    }

    /**
     * @param cancelButton : the text of the cancel button
     */
    @objid ("2e875aaf-0aa2-4423-877c-08eb26c91a7b")
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    @objid ("8ae1618a-acbb-4877-8cc7-de6aebeb2e36")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    @objid ("4fc77530-396e-436f-9510-ee3acddfec1a")
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    @objid ("bf07f159-d802-41c8-9d86-6fec4f1c285c")
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    @objid ("75c339ae-4c58-4135-985d-1769a8b1c83f")
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }

    /**
     * Warning user that he does not select a file
     */
    @objid ("b2c5f57b-19d3-4238-9b6d-bee9963699a9")
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    @objid ("2059e33e-f27b-4420-b9c2-0041bfef42c9")
    public static boolean isCancelation() {
        return FileWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    @objid ("fd7766dc-6031-4196-8bd6-fb93b39fad96")
    public static void setCancellation(final boolean cancelation) {
        FileWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    @objid ("b8196352-e6d0-4c01-a6a0-f9ba03c6c3a8")
    public abstract void validationAction();

    /**
     * set button labels
     */
    @objid ("df57e3d3-0af8-467e-a782-d262d4d9a042")
    public abstract void setLabels();

    /**
     * initialize file path
     */
    @objid ("09f7289d-fda9-42b7-9ac3-33b85844097d")
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    @objid ("1bc0de99-78e5-47d9-a263-cab1ee52d9b5")
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage("Specified File do not exist");
        messageBox.open();
    }

    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    @objid ("99f0e439-87e0-44b6-9186-10327560d261")
    public FileWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    @objid ("3cef495f-4909-46c6-8589-c670b53d6be9")
    public FileWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    @objid ("bdc80bf6-fb5f-44b2-b65a-83f88fce73ed")
    public void setSelectedElt(final ModelElement selectedElt) {
        this.selectedElt = selectedElt;
    }

    @objid ("0392cf45-36a5-4579-90ae-85b48372342a")
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
    @objid ("3f386ca0-1685-4fd1-832b-c02d4d12017f")
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

    @objid ("008b7673-33ba-4226-881c-3d5ab5c9c0c7")
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

    @objid ("59e841f2-0af8-46e2-b154-cef778e6d3fd")
    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(this.shell, icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

}
