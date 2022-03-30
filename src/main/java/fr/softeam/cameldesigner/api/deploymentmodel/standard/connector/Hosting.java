/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << Hosting >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("48ee1919-d6f2-4da9-bbe0-d4d5b45b6d43")
public class Hosting extends ComponentRelation {
    @objid ("895754b7-96e2-476b-a783-1215b7f0b112")
    public static final String STEREOTYPE_NAME = "Hosting";

    /**
     * Tells whether a {@link Hosting proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Hosting >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e1fc44bb-a039-4692-94ac-0d22db089300")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Hosting >> then instantiate a {@link Hosting} proxy.
     * 
     * @return a {@link Hosting} proxy on the created {@link Connector}.
     */
    @objid ("195c622b-35b7-456a-aae6-789fae126816")
    public static Hosting create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME);
        return Hosting.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Hosting} proxy or <i>null</i>.
     */
    @objid ("1e067f9c-6682-4f5f-841e-3e6a3c39e4ab")
    public static Hosting instantiate(final Connector obj) {
        return Hosting.canInstantiate(obj) ? new Hosting(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Hosting} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5bb525d3-fe5c-4e76-a2f2-fd65043e3500")
    public static Hosting safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Hosting.canInstantiate(obj))
        	return new Hosting(obj);
        else
        	throw new IllegalArgumentException("Hosting: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6db6afd8-5d43-4597-bbf5-ec15ef5a0c50")
    public void addRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
            d.setName("requiredHostsConfiguration");
            d.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostsConfiguration");
        }
    }

    @objid ("7c59b094-a33c-4e5a-a9cc-865f5e0e84e9")
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
        Hosting other = (Hosting) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("161b1c9b-86e9-4ddc-8e0d-db6962672229")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'providedHostConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ab704d49-17d8-47d4-9e44-ed1e3d5457d2")
    public Configuration getProvidedHostConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "providedHostConfiguration")){
                  if (ClusterConfiguration.canInstantiate(d.getDependsOn()))
                     return (ClusterConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ClusterConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSConfiguration.canInstantiate(d.getDependsOn()))
                     return (PaaSConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScriptConfiguration.canInstantiate(d.getDependsOn()))
                     return (ScriptConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScriptConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServerlessConfiguration.canInstantiate(d.getDependsOn()))
                     return (ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServerlessConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f163541d-0bd9-4d1a-b306-ec12c9e957c4")
    public List<Configuration> getRequiredHostsConfiguration() {
        List<Configuration> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostsConfiguration")){
              if (ClusterConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ClusterConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ClusterConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (PaaSConfiguration.canInstantiate(d.getDependsOn()))
                results.add((PaaSConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ScriptConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ScriptConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScriptConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ServerlessConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServerlessConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("92cc5374-7248-4ab8-8366-199429633573")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f86175c9-8e9c-4b08-a0f9-7c41ef28cc15")
    public boolean removeRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'providedHostConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4e6baa33-e44e-475d-a20a-f9dd6e5b7bb2")
    public void setProvidedHostConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "providedHostConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
              dep.setName("providedHostConfiguration");      dep.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "providedHostConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("fbdcd9f9-3090-49bf-8eaa-c6093e196a95")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("62a79dae-82cf-4f71-8482-b2d45d3a547d")
    protected Hosting(final Connector elt) {
        super(elt);
    }

    @objid ("71058a75-05c8-4604-b534-ff2d31f52287")
    public static final class MdaTypes {
        @objid ("f0817ee4-5a50-4cf8-9b30-62ca61dcb6f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ae9d229-242b-413f-b6a9-30058b4821e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("61ee678e-909e-4c30-a587-48f66497f6ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a780c993-8026-43d2-afb9-42667b9d0eca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d727bc20-8640-446b-8252-f7e3783e8efe");
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
