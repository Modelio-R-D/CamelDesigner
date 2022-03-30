/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("be6cd351-c687-4e86-95a8-7a8889cd75fa")
    public static final String STEREOTYPE_NAME = "ScalingAction";

    /**
     * Tells whether a {@link ScalingAction proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << ScalingAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3497cd7a-19c1-4686-8014-7f37d9a81b23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof NameSpace) && ((NameSpace) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalingAction.STEREOTYPE_NAME));
    }

    @objid ("df5b255a-06be-4427-aba1-4a5466c5fdaa")
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
    @objid ("92cf670a-be95-4157-a3ae-389f4fcc8d26")
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
    @objid ("1abfa74a-ef52-40e9-8b8d-55e1a202cb0b")
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

    @objid ("8bd642ae-090e-4feb-9a12-76ae93c10be0")
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
    @objid ("76fb6912-b38b-417c-b807-989961ff70a9")
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

    @objid ("eb2a0975-151d-4858-8d3f-ca951dc94858")
    protected ScalingAction(final NameSpace elt) {
        super(elt);
    }

    @objid ("8b410711-e57b-4938-903b-9dc7cc45b117")
    public static final class MdaTypes {
        @objid ("b438c5fc-31e9-4953-a611-65147e60113d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("988fcb88-6a42-4b18-b21f-9bbf704c0385")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ebe94da-10cf-44bf-91db-0d10ef0f949d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d27dd4f-fb43-4fea-9757-3a52a15bf519")
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
