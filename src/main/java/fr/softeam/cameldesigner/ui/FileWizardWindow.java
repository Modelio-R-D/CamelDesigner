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
@objid ("ee9d67e5-655c-4ed0-ad8c-d9e3a8732a57")
public abstract class FileWizardWindow extends Dialog {
    @objid ("33c1da4d-d417-4808-abad-e6b059b2f360")
    private String title = "";

    @objid ("82dde058-af06-4292-bbab-d2669ee54619")
    private String description = "";

    @objid ("75f7df35-d6cb-4644-bb81-8a87e84cae0c")
    private String frametitle = "";

    @objid ("18ab7fbf-389a-4f44-b6a8-f555dcc309e7")
    private String cancelButton = "";

    @objid ("8713fbb8-fc1c-459e-9ce4-c1fed3e2e3f8")
    private String validateButton = "";

    @objid ("68ab61d5-429a-4f07-8663-981a92bd766b")
    private static boolean cancelation = false;

    @objid ("c62daea6-2ff9-419c-90d8-4afcdc22b7c9")
    protected boolean error = false;

    @objid ("2d049287-73e6-48d3-b6ec-3dfaa152d24e")
    protected String path = "";

    @objid ("f6e61c9b-251c-4d12-ba10-8b5d514a1d5a")
    protected ModelElement selectedElt = null;

    @objid ("62260d4c-8f15-4433-8923-26ace593c41f")
    protected Shell shell = null;

    @objid ("25fb404d-c7d3-4e77-8867-e01accbea399")
    protected NameComposite nameComposite = null;

    @objid ("799750ed-529c-4efd-810b-5a63ca556d65")
    private ValidationBoutonComposite validateComposite = null;

    @objid ("7707c8da-18a8-4126-b967-09f5b394dff8")
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

    @objid ("f86dbab8-2051-407f-9836-6e4bd5ee01b8")
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
    @objid ("831bc891-0566-463d-9a66-68e7a31c1d78")
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    @objid ("58a4195d-116f-4ef5-be85-ecde893cb851")
    public MObject getSelectedElt() {
        return this.selectedElt;
    }

    @objid ("4114d0be-1c87-4dce-8b89-004474dceca0")
    void cancelAction() {
        if ((this.shell != null) && (!this.shell.isDisposed())){
            this.shell.dispose();
        }
    }

    /**
     * @param cancelButton : the text of the cancel button
     */
    @objid ("690ace17-645f-4668-97e7-0fefcd2bf304")
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    @objid ("4caa832c-b3b7-49a5-90bf-4e4143638637")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    @objid ("c936759a-fb2c-4997-8201-a8d268b626a8")
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    @objid ("8552147e-283c-44a7-93b7-bf00dc789b17")
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    @objid ("2fb9cc0a-eaca-47cf-b7c1-77989baaca5d")
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }

    /**
     * Warning user that he does not select a file
     */
    @objid ("58a4b56c-7c59-40fe-a2a0-c1ccff32b5d0")
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    @objid ("e750ae32-393c-424e-a160-d8d3cca08535")
    public static boolean isCancelation() {
        return FileWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    @objid ("d963befc-e571-4425-889f-9c26f6fe4402")
    public static void setCancellation(final boolean cancelation) {
        FileWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    @objid ("4f32d6d7-d4bd-4e65-afad-285bb6350110")
    public abstract void validationAction();

    /**
     * set button labels
     */
    @objid ("b87799b0-37bb-4fc8-aa24-eaafa1a6faad")
    public abstract void setLabels();

    /**
     * initialize file path
     */
    @objid ("c30eebad-6381-42d4-8fdb-beae39d8b431")
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    @objid ("3e76768d-64ff-4009-ad0f-24c6908daff0")
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage("Specified File do not exist");
        messageBox.open();
    }

    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    @objid ("2eb908b7-ea67-4e19-98fe-d236c31e7db1")
    public FileWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    @objid ("aff4d993-6656-481e-abef-95ce269fce3f")
    public FileWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    @objid ("d8d31d22-9c9b-401f-9887-7b4a814bc8bf")
    public void setSelectedElt(final ModelElement selectedElt) {
        this.selectedElt = selectedElt;
    }

    @objid ("fe4c7760-3146-4f0d-81b3-a7ffd467b088")
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
    @objid ("a9cd0ee1-3d61-4c17-a2d5-c0cbaebe9449")
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

    @objid ("6c4bf4b3-18ac-4d2c-8705-5aff41d7ff05")
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

    @objid ("9b5dc36c-2bdf-4e82-a35f-ebf392706229")
    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(this.shell, icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

}
