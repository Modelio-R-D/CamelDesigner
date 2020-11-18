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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.elementmodel.umlmodel.UmlModelService;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcess extends AbstractReverseProcess {
    private UmlModelService umlModelService = new UmlModelService ();

    public ReverseProcess(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

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

    private CamelElement reverse(DeploymentModel deploymentModel) {
        if (deploymentModel instanceof DeploymentTypeModel) {
            return reverse ((DeploymentTypeModel) deploymentModel);
        } else if (deploymentModel instanceof DeploymentInstanceModel) {
            return reverse ((DeploymentInstanceModel) deploymentModel);
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel reverse(RequirementModel requirementModel) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.create();
    }

    private fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel reverse(ExecutionModel subModel) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.create();
    }

    private fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel reverse(LocationModel subModel) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.create();
    }

    private CamelElement reverse(MetricModel subModel) {
        if (subModel instanceof MetricTypeModel) {
            return reverse ((MetricTypeModel) subModel);
        } else if (subModel instanceof MetricInstanceModel) {
            return reverse ((MetricInstanceModel) subModel);
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel reverse(OrganisationModel subModel) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.create();
    }

    private fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel reverse(ScalabilityModel subModel) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.create();
    }

    private fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel reverse(SecurityModel subModel) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.create();
    }

    private fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel reverse(UnitModel subModel) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.create();
    }

    private fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel reverse(ConstraintModel subModel) {
        return fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.create();
    }

    private CamelElement reverse(DataModel subModel) {
        if (subModel instanceof DataTypeModel) {
            return reverse ((DataTypeModel) subModel);
        } else if (subModel instanceof DataInstanceModel) {
            return reverse ((DataInstanceModel) subModel);
        }
        return null;
    }

    private fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel reverse(MetaDataModel subModel) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.create();
    }

    private fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel reverse(DeploymentTypeModel deploymentTypeModel) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.create();
    }

    private fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel reverse(DeploymentInstanceModel deploymentInstanceModel) {
        return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel reverse(MetricInstanceModel element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.create();
    }

    private fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel reverse(MetricTypeModel element) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.create();
    }

    private fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel reverse(DataInstanceModel element) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.create();
    }

    private fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel reverse(DataTypeModel element) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.create();
    }

}
