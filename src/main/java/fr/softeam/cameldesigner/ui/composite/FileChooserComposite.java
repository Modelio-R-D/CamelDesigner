package fr.softeam.cameldesigner.ui.composite;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This class defines the file chooser composite.
 * This composite is composed of
 * - a text field in order to specify the desired file
 * - a file browser button for allowing file browsing
 * 
 * It is a SWT composite
 * @author ebrosse
 */
@objid ("250cf164-45e4-4865-9c0a-2b46cb30a893")
public class FileChooserComposite extends Composite {
    @objid ("25a42bb5-0e36-45a6-9545-17c9cfeaabbf")
    private File currentFile = null;

    @objid ("16dc098b-75f5-4ef8-b165-ea6cea9ecf9c")
    private Text text = null;

    @objid ("1ae63f67-3087-4578-9f67-80ca0698a2b1")
    private Button searchButton = null;

    @objid ("5fd7d761-617c-4ed4-9729-a99403624da9")
    protected FileDialog dialog = null;

    /**
     * This method returns the chosen file
     * 
     * @return the path of the chosen file
     */
    @objid ("8eb6239b-db2c-4d6f-b3c5-155e1a2bb1d3")
    public File getCurrentFile() {
        String nomFichier = this.text.getText();
        if ((nomFichier != null) && (nomFichier.length() != 0)) {
            this.currentFile = new File(nomFichier);
        } else {
            this.currentFile = null;
        }
        return this.currentFile;
    }

    /**
     * This method allows to set the chosen file
     * 
     * @param currentFile : the chosen file
     */
    @objid ("ede8bfea-db83-438a-8578-a4d7710e680a")
    public void setCurrentFile(final File currentFile) {
        this.currentFile = currentFile;
    }

    /**
     * This method sets the label of the composite
     * 
     * @param label : the label of the composite
     */
    @objid ("92c7ddb5-946d-40ab-bba7-43c635f4f1b9")
    public void setText(final String label) {
        if (label != null)
            this.text.setText(label);
    }

    /**
     * Constructor of the FileChooserComposite.
     * It needs :
     * - the parent composite
     * - its SWT style
     * - the selection type of the SWT FileDialog
     * 
     * @param parent : the SWT composite owner
     * @param style : the SWT style
     * @param typeSelection : the SWT selection type
     */
    @objid ("c0639d99-b545-4eb9-97c7-80139c423aa5")
    public FileChooserComposite(final Composite parent, final int style, final int typeSelection) {
        super(parent, style);
        setLayout(new FormLayout());
        this.dialog = new FileDialog((Shell) parent, typeSelection);
        
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        this.setLayout(gridLayout);
        this.text = new Text(this, SWT.BORDER);
        this.text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        this.text.setEnabled(true);
        this.searchButton = new Button(this, SWT.NONE);
        File file = new File(CamelDesignerResourcesManager.getInstance().getImage("directory.png"));
        this.searchButton.setImage(new Image(Display.getDefault(), file.getAbsolutePath()));
    }

    /**
     * This method launch the folder browsing and returns the path of the chosen file
     * 
     * @return the path of the chosen file
     */
    @objid ("8a34dcbc-2106-45d8-be11-dcd88d7595a6")
    public String searchFile() {
        String nomFichier = this.dialog.open();
        if ((nomFichier != null) && (nomFichier.length() != 0)) {
            this.currentFile = new File(nomFichier);
            this.text.setText(nomFichier);
        }
        return this.text.getText();
    }

    /**
     * This method returns the search button of the composite
     * 
     * @return the search button
     */
    @objid ("b0fb3529-a0f0-408d-b9bf-2e63bbcd2235")
    public Button getSearch() {
        return this.searchButton;
    }

    /**
     * This methods returns the text available in the SWT FileDialog
     * 
     * @return the text of the FileDialog
     */
    @objid ("82e9471e-841e-486f-bde3-f798fc549eee")
    public String getText() {
        return this.text.getText();
    }

    /**
     * This method returns the SWT Text owned by the FileChooserComposite
     * 
     * @return the owned SWT TEXT
     */
    @objid ("2385024f-4ae2-4b8c-a20b-0888e33b6be1")
    public Text getTextButton() {
        return this.text;
    }

    /**
     * This method returns the SWT FileDialog created inside the FileChooserComposite
     * 
     * @return the owned FileDialog
     */
    @objid ("43998d67-1632-4d98-bbdf-da583d52f8f2")
    public FileDialog getDialog() {
        return this.dialog;
    }

}
