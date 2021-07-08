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


package fr.softeam.cameldesigner.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.ui.composite.FileChooserComposite;
import fr.softeam.cameldesigner.ui.composite.ValidationBoutonComposite;

/**
 * @author ebrosse
 */
public abstract class AbstractSwtWizardWindow extends Dialog {
    private String title = "";

    private String description = "";

   protected String frametitle = "";

    protected String cancelButton = "";

    protected String validateButton = "";


    private static boolean cancelation = false;

    protected boolean exportWindows = false;

    protected boolean error = false;

    protected String path = "";

    protected ModelElement selectedElt = null;

    protected Shell shell = null;

    protected FileChooserComposite fileChooserComposite = null;

    protected ValidationBoutonComposite validateComposite = null;


    /**
     * @return nothing
     */
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
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    public MObject getSelectedElt() {
        return this.selectedElt;
    }

    void cancelAction() {
        if ((this.shell != null) && (!this.shell.isDisposed())){
            this.shell.dispose();
        }
    }


    /**
     * @param cancelButton : the text of the cancel button
     */
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }

    protected FileChooserComposite getFileChooserComposite() {
        return this.fileChooserComposite;
    }


    /**
     * Warning user that he does not select a file
     */
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    public static boolean isCancelation() {
        return AbstractSwtWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    public static void setCancellation(final boolean cancelation) {
        AbstractSwtWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    public abstract void validationAction();

    /**
     * set button labels
     */
    public abstract void setLabels();

    /**
     * initialize file path
     */
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage("Specified File do not exist");
        messageBox.open();
    }


    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    public AbstractSwtWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    public AbstractSwtWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    public void setSelectedElt(final ModelElement selectedElt) {
        this.selectedElt = selectedElt;
    }

    private void centerOnPrimaryScreen(Display display) {
        Monitor primary = display.getPrimaryMonitor();
        Rectangle bounds = primary.getBounds();
        Rectangle rect = this.shell.getBounds();
        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;
        this.shell.setLocation(x, y);
        this.shell.open();
    }


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
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

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

    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(this.shell, icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        messageBox.open();
    }

}
