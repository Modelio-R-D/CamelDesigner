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

import java.io.File;
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
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;

/**
 * This class defines the file chooser composite.
 * This composite is composed of
 * - a text field in order to specify the desired file
 * - a file browser button for allowing file browsing
 *
 * It is a SWT composite
 * @author ebrosse
 */
public class FileChooserComposite extends Composite {

    private File currentFile = null;

    private Text text = null;


    private Button searchButton = null;


    protected FileDialog dialog = null;

    /**
     * This method returns the chosen file
     * @return the path of the chosen file
     */
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
     * @param currentFile : the chosen file
     */
    public void setCurrentFile(final File currentFile) {
        this.currentFile = currentFile;
    }

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
     * @return the path of the chosen file
     */
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
     * @return the search button
     */
    public Button getSearch() {
        return this.searchButton;
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

    /**
     * This method returns the SWT FileDialog created inside the FileChooserComposite
     * @return the owned FileDialog
     */
    public FileDialog getDialog() {
        return this.dialog;
    }

}
