package fr.softeam.cameldesigner.audit;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.audit.report.IReportWriter;
import fr.softeam.cameldesigner.audit.rule.IRule;

@objid ("bb2beadc-5d9a-4953-8120-1a6bc62433fd")
public class CheckEngine {
    @objid ("a2c14040-90b2-48e4-9115-e6ffad911c42")
    private CamelModel _root = null;

    @objid ("19c1891e-9875-4870-8c24-6906b0af224d")
    private CheckerPlan _plan = null;

    @objid ("40ef40fe-38c2-48ce-bae7-204d0274c572")
    private IReportWriter _reportWriter = null;

    @objid ("5bfb0e90-df8a-494e-a2a3-e539365da1c2")
    public CheckEngine(CamelModel root, CheckerPlan plan, IReportWriter reportWriter) {
        this._root = root;
        this._plan = plan;
        this._reportWriter = reportWriter;
    }

    @objid ("d35a0c0c-b514-4db5-869a-3d7f7fa5a415")
    public void run() {
        List<CamelElement> elts = new ArrayList<>();
        elts.add(this._root);
        
        while(elts.size() > 0) {
            List<CamelElement> childs = new ArrayList<>();
            for (CamelElement current : elts){
                for(IRule violated : this._plan.check(current)) {
                    this._reportWriter.addError(violated.getRuleId(), current.getElement(), violated.getDescription(current));
                }
                childs.addAll(current.getChilds());
            }
            elts = childs;
        }
    }

}
