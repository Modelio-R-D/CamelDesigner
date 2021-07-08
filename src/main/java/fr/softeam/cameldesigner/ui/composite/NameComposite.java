/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 *
 */


package fr.softeam.cameldesigner.ui.composite;

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

public class NameComposite extends Composite {

    private Text text = null;

    /**
     * This method sets the label of the composite
     * @param label : the label of the composite
     */
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
     * @param parent : the SWT composite owner
     * @param style : the SWT style
     * @param typeSelection : the SWT selection type
     */
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
     * @return the text of the FileDialog
     */
    public String getText() {
        return this.text.getText();
    }

    /**
     * This method returns the SWT Text owned by the FileChooserComposite
     * @return the owned SWT TEXT
     */
    public Text getTextButton() {
        return this.text;
    }


}
