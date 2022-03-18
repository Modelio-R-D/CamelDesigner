package fr.softeam.cameldesigner.ui.composite;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
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
@objid ("9859ccc1-0a19-4638-916e-87f11d0e3c85")
public class NameComposite extends Composite {
    @objid ("ca5ad23b-797c-4f5e-83c9-7769f94749e9")
    private Text text = null;

    /**
     * This method sets the label of the composite
     * 
     * @param label : the label of the composite
     */
    @objid ("87e07d7b-a95a-49ad-a355-c976bcb1b49f")
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
    @objid ("1662eb40-1286-4d01-bea4-e09df28383ce")
    public NameComposite(final Composite parent, final int style, final int typeSelection) {
        super(parent, style);
        setLayout(new FormLayout());
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        this.setLayout(gridLayout);
        this.text = new Text(this, SWT.BORDER);
        this.text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        this.text.setEnabled(true);
    }

    /**
     * This methods returns the text available in the SWT FileDialog
     * 
     * @return the text of the FileDialog
     */
    @objid ("20a1256e-1657-454c-82b0-3763d1ffe884")
    public String getText() {
        return this.text.getText();
    }

    /**
     * This method returns the SWT Text owned by the FileChooserComposite
     * 
     * @return the owned SWT TEXT
     */
    @objid ("2c50221d-669a-4988-90fe-20520665fcd6")
    public Text getTextButton() {
        return this.text;
    }

}
