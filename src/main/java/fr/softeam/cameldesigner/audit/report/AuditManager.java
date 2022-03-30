package fr.softeam.cameldesigner.audit.report;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * This class is the controller of the audit report windows.
 * 
 * It provides all needed services and manages the relations between the XMI report model and the XMI report dialog.
 * @author ebrosse
 */
@objid ("929a22ac-b9de-4f97-902f-3c6fd6ab2813")
public class AuditManager {
    @objid ("cbd981ec-5925-4a6b-9736-0b95e238b6ad")
    private static ReportDialog dialog;

    /**
     * This method opens the XMI report dialog
     * 
     * @param report : the report model exposed in report dialog
     */
    @objid ("76b5786c-67d8-428c-84be-f045cf5c9f93")
    public static void showGenerationReport(final Shell shell, final ReportModel report) {
        if (report == null || report.isEmpty ()) {
            if (AuditManager.dialog != null &&
                    !AuditManager.dialog.isDisposed ()) {
                AuditManager.dialog.close ();
            }
        } else {
        
            // Get the current display
            Display display = Display.getCurrent();
        
            if (display == null) {
                display = Display.getDefault();
            }
        
            if (AuditManager.dialog == null ||
                    AuditManager.dialog.isDisposed ()) {
                AuditManager.dialog = new ReportDialog (shell, CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getNavigationService());
            }
        
            AuditManager.dialog.setModel(report);
        
            if (AuditManager.dialog.open () == SWT.OK) {
                shell.dispose();
            }
        }
    }

    /**
     * This method creates a new Report Model
     * 
     * @return the created Report Model
     */
    @objid ("87148910-7deb-4ad4-b344-9ed29feb2f7f")
    public static ReportModel getNewReport() {
        return new ReportModel ();
    }

}
