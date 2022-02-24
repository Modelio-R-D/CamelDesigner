package fr.softeam.cameldesigner.exchange.exporter.execution;

import java.sql.Date;
import camel.execution.ExecutionFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import org.eclipse.emf.cdo.CDOObject;

@objid ("42354cea-a0e5-487c-af81-2864d05b4038")
public class SLOViolationExporter<T extends SLOViolation> extends CauseExporter<T> {
    @objid ("2f1e1c3a-eda8-4b77-891f-5eefb567fbc5")
    public SLOViolationExporter(T elt) {
        super(elt);
    }

    @objid ("813965cc-3d63-4ee1-aed5-e353ece3267e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ExecutionFactory.eINSTANCE.createSLOViolation();
    }

    @objid ("f7c68c77-622a-43eb-98e0-9a83139cc77e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.execution.SLOViolation) {
            camel.execution.SLOViolation slov = (camel.execution.SLOViolation) elt;
            setSLO(slov);
            setMeasurement(slov);
            setAssessmentTime(slov);
        }
    }

    @objid ("134706f5-6d99-4572-bb93-d6f6958b4ae2")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.execution.ExecutionModel) && (elt instanceof camel.execution.SLOViolation)) {
            ((camel.execution.ExecutionModel) context).getSloViolations().add((camel.execution.SLOViolation) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("d7c1a42a-c841-40d3-b400-3f13b90318cb")
    private void setAssessmentTime(camel.execution.SLOViolation slov) {
        slov.setAssessmentTime(Date.valueOf(this._element.getAssessmentTime()));
    }

    @objid ("c09459a3-18d9-42e2-b7ad-c993dfb30102")
    private void setMeasurement(camel.execution.SLOViolation slov) {
        CDOObject comp =  this._process.getElement(this._element.getMeasurement());
        if ((comp != null) &&  (comp instanceof camel.execution.Measurement))
            slov.setMeasurement((camel.execution.Measurement) comp);
    }

    @objid ("db7d2bbe-213f-426e-82e3-9b8c0695c737")
    private void setSLO(camel.execution.SLOViolation slov) {
        CDOObject comp =  this._process.getElement(this._element.getSlo());
        if ((comp != null) &&  (comp instanceof camel.requirement.ServiceLevelObjective))
            slov.setSlo((camel.requirement.ServiceLevelObjective) comp);
    }

}
