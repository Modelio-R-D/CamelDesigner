package fr.softeam.cameldesigner.ui.composite;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.ui.CamelFormat;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class defines the format chooser composite.
 * This composite is composed of
 * - a combo field in order to specify the desired format
 * - a label
 * 
 * It is a SWT composite
 * @author ebrosse
 */
@objid ("8f402552-d2a0-4bdc-8569-a613f8cb3830")
public class FormatChooserComposite extends Composite {
    @objid ("cea52001-f233-4310-bb98-265c35cdfcab")
    private CamelFormat[] formats = CamelFormat.values();

    @objid ("d297acf9-6d48-41f1-8bf8-16ed444a603e")
    private Label label = null;

    @objid ("d9fa2953-b173-421c-a789-c60c025a6b21")
    private Combo combo = null;

    /**
     * This method sets the label of the composite
     * 
     * @param label : the label of the composite
     */
    @objid ("b1b1d14b-c247-4a3f-a083-d4b49e486a0c")
    public void setText(final String label) {
        if (label != null)
            this.label.setText(label);
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
    @objid ("0184e9e0-1149-4fb5-926e-b59072e5a172")
    public FormatChooserComposite(final Composite parent, final int style, final int typeSelection) {
        super(parent, style);
        
        setLayout(new FormLayout());
        
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        this.setLayout(gridLayout);
        
        this.label = new Label(this, SWT.WRAP);
        this.combo = new Combo(this, SWT.READ_ONLY);
        final GridData gridData = new GridData();
        gridData.widthHint = 130;
        this.combo.setLayoutData(gridData);
        
        
        String currentFormat = CamelFormat.XMI.toString();
        
        for (int i = 0; i < this.formats.length; i++) {
            this.combo.add(this.formats[i].toString());
        
            if (this.formats[i].equals(currentFormat))
                this.combo.select(i);
        }
        
        this.label.setText("Format : ");
        this.combo.setToolTipText("");
        this.label.setToolTipText("");
    }

    /**
     * This method returns the UML version specified
     * 
     * @return a UML version of the export
     */
    @objid ("4afbc090-df1a-4523-9c7e-2c311c6ae62a")
    public CamelFormat getFormat() {
        return this.formats[this.combo.getSelectionIndex()];
    }

}
