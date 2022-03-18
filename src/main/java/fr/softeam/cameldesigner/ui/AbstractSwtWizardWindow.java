package fr.softeam.cameldesigner.ui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.ui.composite.FileChooserComposite;
import fr.softeam.cameldesigner.ui.composite.ValidationBoutonComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author ebrosse
 */
@objid ("f6fc204a-c441-4951-beac-4e9b486827d0")
public abstract class AbstractSwtWizardWindow extends Dialog {
    @objid ("5ccbf231-b23b-4fc6-9e45-088abe4dd347")
    private String title = "";

    @objid ("7dcf3994-462e-4228-ae8c-89659ff85c71")
    private String description = "";

    @objid ("ea34ee0e-77bc-4696-8f48-44156e281b00")
    protected String frametitle = "";

    @objid ("e11f2394-6ba3-4012-9533-c4409cfe6826")
    protected String cancelButton = "";

    @objid ("95b556a2-cf88-4c11-b26d-29bbe64c6200")
    protected String validateButton = "";

    @objid ("800d2731-5f6b-4822-a683-defabad5edd2")
    private static boolean cancelation = false;

    @objid ("6af8d643-4a9a-4eaa-a0ae-e586ef8fcb88")
    protected boolean exportWindows = false;

    @objid ("f77ccdbb-27f5-4b20-83c9-6ffeacfd3708")
    protected boolean error = false;

    @objid ("490bd008-5766-4f54-a7b1-a87802a710cc")
    protected String path = "";

    @objid ("fcfab3ad-baff-44c7-ade6-c76350915cbc")
    protected org.modelio.metamodel.uml.statik.Package selectedElt = null;

    @objid ("6daa6141-c8ab-4306-8921-7e48bda12d97")
    protected Shell shell = null;

    @objid ("f29d190d-c138-44c4-964d-0fc69751553f")
    protected FileChooserComposite fileChooserComposite = null;

    @objid ("a9dac488-63d5-42ee-a321-370944a3aaca")
    protected ValidationBoutonComposite validateComposite = null;

    @objid ("5c0ebf98-0dcf-4d0a-9d57-124d9ca2b2af")
    protected Object open() {
        setCancellation(false);
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

    /**
     * set default configuration of the dialog box
     */
    @objid ("3484be44-beee-4f1d-b666-8009d6bca764")
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    @objid ("0ff69447-d20c-4cce-837c-b67e838f0ef6")
    public MObject getSelectedElt() {
        return this.selectedElt;
    }

    @objid ("7d38952e-8aeb-44e6-8d68-c73913776565")
    void cancelAction() {
        if ((this.shell != null) && (!this.shell.isDisposed())){
            this.shell.dispose();
        }
    }

    /**
     * @param cancelButton : the text of the cancel button
     */
    @objid ("1040c74a-b7f5-487b-9c1b-edfb2a5a3232")
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    @objid ("89e43d80-598d-478d-98f2-a0736902db6f")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    @objid ("15b7a944-1f72-47e8-8ff3-092d59952d3a")
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    @objid ("059fb53c-791e-4a9d-9467-d2292ac3ca61")
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    @objid ("4f9fe870-c971-478e-a7a4-fcd930595e10")
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }

    @objid ("1081df1c-592d-48e2-be69-cc6c7a139fa0")
    protected FileChooserComposite getFileChooserComposite() {
        return this.fileChooserComposite;
    }

    /**
     * Warning user that he does not select a file
     */
    @objid ("ec1c925f-7f02-4084-a371-0b9d71dfcf6c")
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    @objid ("24cd9f9e-cd75-41cf-bfcc-4fc3b3026de1")
    public static boolean isCancelation() {
        return AbstractSwtWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    @objid ("ae9ad971-eda0-45f2-977b-f120a5eb06a0")
    public static void setCancellation(final boolean cancelation) {
        AbstractSwtWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    @objid ("8b18aea9-03cd-43b8-a8d0-1fea8f363eeb")
    public abstract void validationAction();

    /**
     * set button labels
     */
    @objid ("1f188f80-610e-40be-8ec4-09843941f9a5")
    public abstract void setLabels();

    /**
     * initialize file path
     */
    @objid ("525e208b-0332-44ba-81d6-96f7947c67e9")
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    @objid ("8b2d77d0-d499-4a4a-b4f8-b0cd66d89386")
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage("Specified File do not exist");
        messageBox.open();
    }

    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    @objid ("7a2086f4-e610-4737-b0a7-06faea0d0691")
    public AbstractSwtWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    @objid ("84a71e5c-6837-48c0-8727-5ff5e06b07c4")
    public AbstractSwtWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    @objid ("c8f18212-1885-4e5d-97f1-298f691322f9")
    public void setSelectedElt(final org.modelio.metamodel.uml.statik.Package selectedElt) {
        this.selectedElt = selectedElt;
    }

    @objid ("3eec5f3f-d07a-43bb-a808-a21cbbfd6548")
    private void centerOnPrimaryScreen(Display display) {
        Monitor primary = display.getPrimaryMonitor();
        Rectangle bounds = primary.getBounds();
        Rectangle rect = this.shell.getBounds();
        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;
        this.shell.setLocation(x, y);
        this.shell.open();
    }

    @objid ("f0974f98-818c-47d8-b4cc-31ea7cb3395d")
    void setUMLExtension() {
        String filePath = this.fileChooserComposite.getText();
        int length = filePath.length();
        if ((length - 4) != filePath.lastIndexOf(".uml")) {
            if (filePath.lastIndexOf(".xmi") == (length - 4)) {
                filePath = filePath.substring(0, length - 4) + ".uml";
            } else {
                filePath = filePath + ".uml";
            }
            this.fileChooserComposite.setText(filePath);
        }
    }

    @objid ("06fbdad8-cc56-4351-8a57-7dc8a57d0149")
    void setXMIExtension() {
        String filePath = this.fileChooserComposite.getText();
        int length = filePath.length();
        if ((length - 4) != filePath.lastIndexOf(".xmi")) {
            if (filePath.lastIndexOf(".uml") == (length - 4)) {
                filePath = filePath.substring(0, length - 4) + ".xmi";
            } else {
                filePath = filePath + ".xmi";
            }
            this.fileChooserComposite.setText(filePath);
        }
    }

    /**
     * @param inpath : the initial path
     * @return the same path in a correct form
     */
    @objid ("3e46be0c-08cf-4f19-835d-522d9c243d05")
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

    @objid ("9f94b3d5-eed7-42a7-82b5-9a0cabb2cf31")
    protected void completeBox() {
        this.title = "Complete";
        
        this.description = "Complete";
        
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_INFORMATION);
                AbstractSwtWizardWindow.this.shell.dispose();
            }
        });
    }

    @objid ("d550095b-d8a3-4b4f-b342-56eebc12c457")
    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(this.shell, icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

    @objid ("00e3c0ce-f33a-4eca-b3ab-172abb155b8b")
    protected void errorBox(String msg) {
        this.title = "Error";
        
        this.description = msg;
        
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_ERROR);
                AbstractSwtWizardWindow.this.shell.dispose();
            }
        });
    }

}
