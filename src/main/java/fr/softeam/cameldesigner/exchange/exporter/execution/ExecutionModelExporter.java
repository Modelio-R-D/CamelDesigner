package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.execution.ExecutionFactory;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;

@objid ("db11059e-f431-4aad-810b-e8fb3c3299a6")
public class ExecutionModelExporter<T extends ExecutionModel> extends SubModelExporter<T> {
    @objid ("9ca85901-8ebe-4c1c-9b7e-bff3127be561")
    public ExecutionModelExporter(T elt) {
        super(elt);
    }

    @objid ("a2926394-91de-47ed-b1e2-881904d81182")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createExecutionModel();
    }

    @objid ("f366b3ca-6901-4419-9362-e1e00a88ab51")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.ExecutionModel) {
            camel.execution.ExecutionModel em = (camel.execution.ExecutionModel) elt;
            setStartTime(em);
            setEndTime(em);
            setTotalCost(em);
            setCostUnit(em);
            setDeploymentTypeModel(em);
            setRequirementModel(em);
            setDataTypeModel(em);
        }
    }

    @objid ("34dd56e1-d3cb-48c6-99f2-5054091dcb52")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.execution.ExecutionModel)) {
            ((camel.core.CamelModel) context).getExecutionModels().add((camel.execution.ExecutionModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("8e07ae07-ced3-484d-b123-cc0286023e6a")
    private void setDataTypeModel(camel.execution.ExecutionModel em) {
        CDOObject dtm =  this._process.getElement(this._element.getDataTypeModel());
        if ((dtm != null) &&  (dtm instanceof camel.data.DataTypeModel))
            em.setDataTypeModel((camel.data.DataTypeModel) dtm);
    }

    @objid ("c0cfb46a-2607-4c32-be44-fa737721ef11")
    private void setRequirementModel(camel.execution.ExecutionModel em) {
        CDOObject rm =  this._process.getElement(this._element.getRequirementModel());
        if ((rm != null) &&  (rm instanceof camel.requirement.RequirementModel))
            em.setRequirementModel((camel.requirement.RequirementModel) rm);
    }

    @objid ("6643c683-0128-4221-ae13-a67f3db4fdfe")
    private void setDeploymentTypeModel(camel.execution.ExecutionModel em) {
        CDOObject dtm =  this._process.getElement(this._element.getDeploymentTypeModel());
        if ((dtm != null) &&  (dtm instanceof camel.deployment.DeploymentTypeModel))
            em.setDeploymentTypeModel((camel.deployment.DeploymentTypeModel) dtm);
    }

    @objid ("6bfaabec-1327-454c-b2d7-b0b8500c9c11")
    private void setCostUnit(camel.execution.ExecutionModel em) {
        CDOObject cu =  this._process.getElement(this._element.getCostUnit());
        if ((cu != null) &&  (cu instanceof camel.unit.Unit))
            em.setCostUnit((camel.unit.Unit) cu);
    }

    @objid ("9306a5f6-d01b-4fc3-9e3a-4bbadb53ee87")
    private void setTotalCost(camel.execution.ExecutionModel em) {
        String content = this._element.getTotalCost();
        if (content != null) {
            em.setTotalCost(Double.valueOf(content));
        }
    }

    @objid ("213c87a0-c6ed-47b3-93c4-3f890b28f6c7")
    private void setEndTime(camel.execution.ExecutionModel em) {
        String content = this._element.getEndTime();
        if (content != null) {
            em.setEndTime(Date.valueOf(content));
        }
    }

    @objid ("9ea74efc-aeb9-410f-8730-0b5ea497df66")
    private void setStartTime(camel.execution.ExecutionModel em) {
        String content = this._element.getStartTime();
        if (content != null)
            em.setStartTime(Date.valueOf(content));
    }

}
