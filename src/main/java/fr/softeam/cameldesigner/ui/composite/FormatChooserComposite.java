/*
 * Copyright 2013-2015 Modeliosoft
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import fr.softeam.cameldesigner.ui.CamelFormat;

/**
 * This class defines the format chooser composite.
 * This composite is composed of
 * - a combo field in order to specify the desired format
 * - a label
 *
 * It is a SWT composite
 * @author ebrosse
 */

public class FormatChooserComposite extends Composite {

    private CamelFormat[] formats =  CamelFormat.values();

    private Label label = null;

    private Combo combo = null;

    /**
     * This method sets the label of the composite
     * @param label : the label of the composite
     */
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
     * @param parent : the SWT composite owner
     * @param style : the SWT style
     * @param typeSelection : the SWT selection type
     */
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
     * @return a UML version of the export
     */
    public CamelFormat getFormat() {
        return this.formats[this.combo.getSelectionIndex()];
    }

}
