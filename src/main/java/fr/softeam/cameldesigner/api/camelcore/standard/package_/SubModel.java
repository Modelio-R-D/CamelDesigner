/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("2ec9122a-212d-419b-9121-92bcca8b7fce")
    public static final String STEREOTYPE_NAME = "SubModel";

    /**
     * Tells whether a {@link SubModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SubModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2496d5bf-c1dd-4869-80d4-f9c61c697eba")
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

    @objid ("f5bee4a6-d3f9-489f-a04d-0ea264f52067")
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
    @objid ("f8dea37a-2a6d-4061-a414-209f3f6411cc")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("6f541e20-e1a8-42aa-bd20-7c2198f527ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ee1278e0-b71d-468e-98ae-ed9ee11a4dee")
    protected SubModel(final Package elt) {
        super(elt);
    }

    @objid ("272d938f-b497-426d-a404-96b884126080")
    public static final class MdaTypes {
        @objid ("5b4b639a-58e3-4c3b-8e8b-1badd31e6923")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a98245db-a8f8-4f2e-9588-82c7eb615ef0")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8a2d945-283f-41b3-a378-718c50920553")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9ad91f2-22c9-425d-9644-97bb05f9c07a")
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
