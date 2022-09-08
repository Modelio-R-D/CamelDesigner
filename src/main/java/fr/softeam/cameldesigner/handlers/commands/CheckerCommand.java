package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.audit.CheckEngine;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.report.AuditManager;
import fr.softeam.cameldesigner.audit.report.ReportModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6fb146cc-9abc-4c88-8dc9-f67fb5b93ca0")
public class CheckerCommand extends DefaultModuleCommandHandler {
    @objid ("b37c4c12-b37f-4bdf-9811-2013ad8fb87d")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        MObject selected = selectedElements.get(0);
        if (CamelModel.canInstantiate(selected)) {
            CamelModel root = CamelModel.instantiate((org.modelio.metamodel.uml.statik.Package) selected);
        
            ReportModel reportModel = AuditManager.getNewReport();
        
            CheckerPlan plan = new CheckerPlan();
            CheckEngine check = new CheckEngine(root, plan, reportModel);
        
            check.run();
        
            if (reportModel.isEmpty())
                completeBox();
            else
                AuditManager.showGenerationReport(Display.getCurrent().getActiveShell(), reportModel);
        
        }
    }

    @objid ("3d9f2d82-af91-4752-8780-8d26344cfe4f")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (((selectedElement instanceof org.modelio.metamodel.uml.statik.Package
                            && ((org.modelio.metamodel.uml.statik.Package)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME))));
        }
        return false;
    }

    @objid ("447cf8a1-a493-4e18-a980-47d652e7b700")
    protected void completeBox() {
        MessageBox messageBox = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_INFORMATION);
        messageBox.setMessage("Complete");
        messageBox.setText("Complete");
        messageBox.open();
    }

}
