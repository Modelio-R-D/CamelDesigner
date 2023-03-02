/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SubModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f07e87ba-586c-403f-a02b-a1871d8d3882")
public abstract class SubModel extends FeaturePackage {
    @objid ("86873e55-bd0f-4514-a32e-8f5ed1996322")
    public static final String STEREOTYPE_NAME = "SubModel";

    /**
     * Tells whether a {@link SubModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SubModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("88fc19af-2d59-4766-93f8-fd2c309ea4e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SubModel.STEREOTYPE_NAME));
    }

    @objid ("cfdee8da-a663-4858-b16b-b3b70f078449")
    public static SubModel instantiate(final Package obj) {
        return ConstraintModel.canInstantiate(obj) ? ConstraintModel.instantiate(obj) :
            DataModel.canInstantiate(obj) ? DataModel.instantiate(obj) :
                DeploymentModel.canInstantiate(obj) ? DeploymentModel.instantiate(obj) :
                    ExecutionModel.canInstantiate(obj) ? ExecutionModel.instantiate(obj) :
                        LocationModel.canInstantiate(obj) ? LocationModel.instantiate(obj) :
                            MetaDataModel.canInstantiate(obj) ? MetaDataModel.instantiate(obj) :
                                MetricModel.canInstantiate(obj) ? MetricModel.instantiate(obj) :
                                    OrganisationModel.canInstantiate(obj) ? OrganisationModel.instantiate(obj) :
                                        RequirementModel.canInstantiate(obj) ? RequirementModel.instantiate(obj) :
                                            ScalabilityModel.canInstantiate(obj) ? ScalabilityModel.instantiate(obj) :
                                                SecurityModel.canInstantiate(obj) ? SecurityModel.instantiate(obj) :
                                                    TypeModel.canInstantiate(obj) ? TypeModel.instantiate(obj) :
                                                        UnitModel.canInstantiate(obj) ? UnitModel.instantiate(obj) : null;
    }

    @objid ("2a903e6d-97e8-44b1-8a1d-72f8ee37406c")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SubModel other = (SubModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e09de470-bc04-4758-9075-725162dc9697")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("d055933b-68d1-4513-a364-9b2260561e6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1fd2d863-8119-4714-affa-1347cf219863")
    protected SubModel(final Package elt) {
        super(elt);
    }

    @objid ("272d938f-b497-426d-a404-96b884126080")
    public static final class MdaTypes {
        @objid ("6a27704a-dd69-47c5-b28b-57ba1480580c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3230db5-28b4-4145-ba5f-a3579c671170")
        private static Stereotype MDAASSOCDEP;

        @objid ("dcc6cb23-a0f0-4962-bdd3-b3893a1950af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b2355e3c-eb8b-4c1b-8607-e67274f6a9cf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "577c153e-42b8-4f36-9686-1a6109ffdc16");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
