/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link NameSpace} with << ScalingAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8486585a-5685-4f6e-9bb4-9334f5924b9f")
public abstract class ScalingAction extends Action {
    @objid ("404eec1e-bf3b-4d34-9828-7ff9a2b84d88")
    public static final String STEREOTYPE_NAME = "ScalingAction";

    /**
     * Tells whether a {@link ScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << ScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1edc9952-5b49-4e65-8d83-752a87346378")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof NameSpace) && ((NameSpace) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalingAction.STEREOTYPE_NAME));
    }

    @objid ("9e707bf5-38ae-4c83-87a5-32c808f2ee15")
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
        ScalingAction other = (ScalingAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link NameSpace}. 
     * @return the NameSpace represented by this proxy, never null.
     */
    @objid ("8846050e-6233-40d3-a0bb-4b8485c60149")
    @Override
    public NameSpace getElement() {
        return (NameSpace)super.getElement();
    }

    /**
     * Get the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ba3ceaae-a051-4e64-b8ff-59c3a5d61035")
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ScalingAction.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ScalingAction.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("581df2e5-9d2e-4275-abe8-23cf47429fbb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("03c019de-d261-4e3b-aa5b-0f35bbfb70bd")
    public void setSoftwareComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ScalingAction.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ScalingAction.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ScalingAction.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponent");      dep.putTagValue(ScalingAction.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("cf1092c4-a2c8-4d82-a990-b3942d77e186")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c767e89a-1e13-4df0-83be-06fe3209b395")
    protected ScalingAction(final NameSpace elt) {
        super(elt);
    }

    @objid ("8b410711-e57b-4938-903b-9dc7cc45b117")
    public static final class MdaTypes {
        @objid ("1d92f330-ac1e-4cff-a73e-34e294faa066")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e868e22b-b074-44b2-ae42-605559da0a95")
        private static Stereotype MDAASSOCDEP;

        @objid ("3aca3f21-111e-4fd2-b9e6-521a70486a2d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d19a4eb6-ee7d-409b-92aa-a07d3c6eeb3f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "25bf81ac-b13e-4716-b766-42a9b7e05150");
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
