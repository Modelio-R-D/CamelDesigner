package fr.softeam.cameldesigner.audit.report;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.audit.report.ReportModel.ElementMessage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.modelio.api.modelio.navigation.INavigationService;
import org.modelio.api.ui.ModelioDialog;

/**
 * Dialog box used for the generation report.
 */
@objid ("85ab75f6-1728-4059-8515-420cbe34566f")
class ReportDialog extends ModelioDialog {
    @objid ("ff3ed614-0878-46f8-a800-babd0a9127af")
    private ReportModel model;

    @objid ("486d816f-7fd3-40d1-9fb0-390fbbb77f36")
     INavigationService navigationService;

    @objid ("3188a9bc-9c21-4b5e-ae1d-f96a9bcf6134")
    private Image warningImage;

    @objid ("88389207-2e9a-4fcc-886b-480a4320dd7c")
    private Image errorImage;

    @objid ("ac63b800-7ac5-4e06-aa67-cc65176a030a")
     Table table;

    @objid ("35ca5e06-8976-4b3b-84f7-f30fe472f22b")
    private Image infoImage;

//    @objid ("030eb5c1-95fe-4f6b-8268-282483a4daca")
//     Text descriptionText;
    @objid ("f4e82603-da41-45a2-89db-ebcfbc56bbfc")
    public ReportDialog(Shell parentShell, final INavigationService navigationService) {
        super (parentShell);
        setShellStyle (SWT.DIALOG_TRIM | getDefaultOrientation ());
        this.navigationService = navigationService;
    }

    @objid ("51369eb5-752b-4e52-a1fa-2b5a7281427e")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton (parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }

    @objid ("4c849156-3fae-4cdd-b217-75ce5a92ae22")
    @Override
    public Control createContentArea(Composite parent) {
        this.warningImage = JFaceResources.getImage ("dialog_messasge_warning_image"); //$NON-NLS-1$
        this.errorImage = JFaceResources.getImage ("dialog_message_error_image"); //$NON-NLS-1$
        this.infoImage = JFaceResources.getImage ("dialog_messasge_info_image"); //$NON-NLS-1$
        
        Point s = getInitialSize ();
        
        
        this.table = new Table (parent, SWT.MULTI | SWT.BORDER |
                SWT.FULL_SELECTION);
        GridData data = new GridData (SWT.FILL, SWT.FILL, true, true);
        this.table.setLayoutData (data);
        this.table.setLinesVisible (true);
        
        TableColumn columnMess = new TableColumn (this.table, SWT.NONE);
        columnMess.setText ("Error ID");
        
        TableColumn columnDescr = new TableColumn (this.table, SWT.NONE);
        columnDescr.setText ("Description");
        
        updateViewFromModel ();
        
        columnMess.setWidth(80);
        columnDescr.setWidth(s.x -80);
        
        
        this.table.addMouseListener (new MouseListener () {
            @Override
            public void mouseDoubleClick (MouseEvent e) {
                TableItem item = ReportDialog.this.table.getItem (new Point (e.x, e.y));
                if (item != null) {
                    if (item.getData () instanceof ElementMessage) {
                        ElementMessage theElement = (ElementMessage) item.getData ();
        
        //                        String desc = theElement.description;
        //                        ReportDialog.this.descriptionText.setText (desc);
        
                        // On a double clic, select the element
                        if (theElement.element != null && theElement.element.isValid ()) {
                            ReportDialog.this.navigationService.fireNavigate (theElement.element);
                        }
                    }
                }
            }
        
            @Override
            public void mouseDown (MouseEvent e) {
                // Nothing to do
            }
        
            @Override
            public void mouseUp (MouseEvent e) {
                TableItem item = ReportDialog.this.table.getItem (new Point (e.x, e.y));
                if (item != null) {
                    if (item.getData () instanceof ElementMessage) {
                        ElementMessage theElement = (ElementMessage) item.getData ();
        
        //                        String desc = theElement.description;
        //                        ReportDialog.this.descriptionText.setText (desc);
        
                        // On a CTRL + clic, select the element
                        if ((e.stateMask & SWT.CTRL) != 0) {
                            if (theElement.element != null && theElement.element.isValid ()) {
                                ReportDialog.this.navigationService.fireNavigate (theElement.element);
                            }
                        }
                    }
                }
            }
        });
        
        //        this.descriptionText = new Text (parent, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.WRAP);
        //        GridData data_description = new GridData (SWT.FILL, SWT.FILL, true, false);
        //        data_description.heightHint = 50;
        //        this.descriptionText.setLayoutData (data_description);
        //        this.descriptionText.setBackground (UIColor.TEXT_READONLY_BG);
        return parent;
    }

    @objid ("c1a78db2-53fa-4c6d-8e6f-1d119a8a4de5")
    private void updateViewFromModel() {
        if (this.table != null) {
            this.table.removeAll ();
        
            if (this.model != null) {
                for (ElementMessage error : this.model.getErrors ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.errorImage);
                    item.setText (0, error.ruleID);
                    item.setText (1, error.description);
                    item.setData (error);
                }
        
                for (ElementMessage warning : this.model.getWarnings ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.warningImage);
                    item.setText (0, warning.ruleID);
                    item.setText (1, warning.description);
                    item.setData (warning);
                }
        
                for (ElementMessage info : this.model.getInfos ()) {
                    TableItem item = new TableItem (this.table, SWT.NONE);
                    item.setImage (0, this.infoImage);
                    item.setText (0, info.ruleID);
                    item.setText (1, info.description);
                    item.setData (info);
                }
            }
        
            this.table.getColumn (0).pack ();
            this.table.getColumn (1).pack ();
        }
    }

    @objid ("0fc05459-d62b-41c6-ab2f-4c60f36d619a")
    public void setModel(ReportModel model) {
        this.model = model;
        updateViewFromModel ();
    }

    @objid ("6a4117eb-aed1-4559-b0c0-1e6dc12208ae")
    public boolean isDisposed() {
        Shell s = getShell ();
        return s == null || s.isDisposed ();
    }

    @objid ("e443ed91-83e9-46d6-b05d-28fc274f7117")
    @Override
    public void init() {
        Shell shell = getShell ();
        
        // Put the messages in the banner area
        setLogoImage (null);
        shell.setText ("Report");
        setTitle ("Report");
        setMessage ("");
    }

    @objid ("8e62061c-2ed6-43ab-b790-48724d72bb36")
    @Override
    protected Point getInitialSize() {
        Point p = super.getInitialSize();
        p.x = (int) Math.floor(p.x*1.35);
        return p;
    }

}
