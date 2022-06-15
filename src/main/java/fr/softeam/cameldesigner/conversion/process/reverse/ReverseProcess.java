package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.constraint.ConstraintModel;
import camel.core.CamelModel;
import camel.data.DataInstanceModel;
import camel.data.DataModel;
import camel.data.DataTypeModel;
import camel.deployment.DeploymentInstanceModel;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.execution.ExecutionModel;
import camel.location.LocationModel;
import camel.metric.MetricInstanceModel;
import camel.metric.MetricModel;
import camel.metric.MetricTypeModel;
import camel.mms.MetaDataModel;
import camel.organisation.OrganisationModel;
import camel.requirement.RequirementModel;
import camel.scalability.ScalabilityModel;
import camel.security.SecurityModel;
import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("61cfea5e-b244-4a01-aee7-1fe4568a7930")
public class ReverseProcess extends AbstractReverseProcess {
    @objid ("7c4859e9-602f-402d-a7dd-77fb07850ba0")
    private UmlModelService umlModelService = new UmlModelService ();

    @objid ("d634c195-85c9-4168-8ada-aa5bb6489df9")
    public ReverseProcess(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("a55b1bb1-1c1d-46d7-b750-1d56b32ba661")
    @Override
    protected CamelElement switchReverse(CDOObject element) {
        if (element instanceof CamelModel) {
            return reverse ((CamelModel) element);
        } else if (element instanceof DeploymentModel) {
            return reverse ((DeploymentModel) element);
        }  else if (element instanceof RequirementModel) {
            return reverse ((RequirementModel) element);
        }  else if (element instanceof MetricModel) {
            return reverse ((MetricModel) element);
        }  else if (element instanceof MetaDataModel) {
            return reverse ((MetaDataModel) element);
        }  else if (element instanceof ExecutionModel) {
            return reverse ((ExecutionModel) element);
        }  else if (element instanceof LocationModel) {
            return reverse ((LocationModel) element);
        }  else if (element instanceof MetricModel) {
            return reverse ((MetricModel) element);
        }  else if (element instanceof OrganisationModel) {
            return reverse ((OrganisationModel) element);
        }  else if (element instanceof ScalabilityModel) {
            return reverse ((ScalabilityModel) element);
        }  else if (element instanceof SecurityModel) {
            return reverse ((SecurityModel) element);
        }  else if (element instanceof UnitModel) {
            return reverse ((UnitModel) element);
        }  else if (element instanceof ConstraintModel) {
            return reverse ((ConstraintModel) element);
        }  else if (element instanceof DataModel) {
            return reverse ((DataModel) element);
        }
        return null;
    }

    @objid ("764818e6-9d37-454c-abae-57d9aefdc22b")
    private fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel reverse(CamelModel camelModel) {
        fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel proxyRootCamelModel = fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.create();
        if(camelModel.getApplication() != null) {
            if(camelModel.getApplication().getName() != null ) {
                proxyRootCamelModel.setApplicationName(camelModel.getApplication().getName());
            }
            if( camelModel.getApplication().getVersion()!= null) {
                proxyRootCamelModel.setApplicationVersion(camelModel.getApplication().getVersion());
            }
        }
        return proxyRootCamelModel;
    }

    @objid ("1b1d7363-8201-41ac-8b5b-418302427cc8")
    private CamelElement reverse(DeploymentModel deploymentModel) {
        if (deploymentModel instanceof DeploymentTypeModel) {
            return reverse ((DeploymentTypeModel) deploymentModel);
        } else if (deploymentModel instanceof DeploymentInstanceModel) {
            return reverse ((DeploymentInstanceModel) deploymentModel);
        }
        return null;
    }

    @objid ("592cc348-070c-4ee6-9bff-7cc81c5f44d4")
    private fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel reverse(RequirementModel requirementModel) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.create();
    }

    @objid ("6aa415d8-3f33-4867-ae90-3196b3e77589")
    private fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel reverse(ExecutionModel subModel) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.create();
    }

    @objid ("098538da-3d90-4ac9-a950-9dc8707d6724")
    private fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel reverse(LocationModel subModel) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.create();
    }

    @objid ("7a82637b-d38f-4127-90a4-cdc45c462a61")
    private CamelElement reverse(MetricModel subModel) {
        if (subModel instanceof MetricTypeModel) {
            return reverse ((MetricTypeModel) subModel);
        } else if (subModel instanceof MetricInstanceModel) {
            return reverse ((MetricInstanceModel) subModel);
        }
        return null;
    }

    @objid ("993a1b24-1eb6-4d66-8c5c-db7b43d20ce6")
    private fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel reverse(OrganisationModel subModel) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.create();
    }

    @objid ("288d0844-a70a-4801-848d-589f8b1bd3cb")
    private fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel reverse(ScalabilityModel subModel) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.create();
    }

    @objid ("d6f2b474-4b04-42b6-8c36-7ca22aa548e2")
    private fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel reverse(SecurityModel subModel) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.create();
    }

    @objid ("a80f3984-f58c-404d-8a80-535da7349d13")
    private fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel reverse(UnitModel subModel) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.create();
    }

    @objid ("f3a17d83-1325-4806-a433-ce2d9d9d8710")
    private fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel reverse(ConstraintModel subModel) {
        return fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.create();
    }

    @objid ("173cf63e-c4e5-43e9-bd6f-19611d1662d8")
    private CamelElement reverse(DataModel subModel) {
        if (subModel instanceof DataTypeModel) {
            return reverse ((DataTypeModel) subModel);
        } else if (subModel instanceof DataInstanceModel) {
            return reverse ((DataInstanceModel) subModel);
        }
        return null;
    }

    @objid ("3d731bf5-25b9-4c4b-8f79-284d247eb325")
    private fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel reverse(MetaDataModel subModel) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.create();
    }

    @objid ("a66278da-facd-4f05-a339-207eb3cfbd50")
    private fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel reverse(DeploymentTypeModel deploymentTypeModel) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.create();
    }

    @objid ("d0a87cf3-381a-4708-b6e1-7fce81a60a66")
    private fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel reverse(DeploymentInstanceModel deploymentInstanceModel) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.create();
    }

    @objid ("8d413d1f-3b40-4f6c-b5bc-a72cf05685b9")
    private fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel reverse(MetricInstanceModel element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.create();
    }

    @objid ("5befc3c2-8763-4aa1-b96e-1a6356b458d9")
    private fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel reverse(MetricTypeModel element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.create();
    }

    @objid ("06041bdd-d23d-4f39-b51d-b349b8876ab4")
    private fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel reverse(DataInstanceModel element) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.create();
    }

    @objid ("a1d248da-6a82-4920-8519-811225605081")
    private fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel reverse(DataTypeModel element) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.create();
    }

    @objid ("840ffbb4-513a-467e-ac4b-22a120a08063")
    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
