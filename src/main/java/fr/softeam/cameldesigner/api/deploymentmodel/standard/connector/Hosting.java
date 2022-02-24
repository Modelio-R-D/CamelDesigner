/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("a046abd4-371d-44ad-95fa-6bac5f990920")
    public static final String STEREOTYPE_NAME = "Hosting";

    /**
     * Tells whether a {@link Hosting proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Hosting >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d7ab309-4111-4608-b758-b6eadc7ac52a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Hosting >> then instantiate a {@link Hosting} proxy.
     * 
     * @return a {@link Hosting} proxy on the created {@link Connector}.
     */
    @objid ("1c02d732-a781-4df4-950c-123b33e1f045")
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
    @objid ("8a457b21-fd6d-4172-8b9e-7e782fbeba11")
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
    @objid ("571e9a49-2046-4b74-bb30-d9cecd8ba2ab")
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
    @objid ("3f9d8784-3d48-4f0e-a0fb-f369b8b3d5ec")
    public void addRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
            d.setName("requiredHostsConfiguration");
            d.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostsConfiguration");
        }
    }

    @objid ("889b5ec1-d05a-490b-936f-b7bd65b1f8cb")
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
    @objid ("8bcf32f0-d88d-4e86-aadf-678a62a7eafb")
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
    @objid ("e68a199e-6670-4812-b3fb-5e3ea4993f2f")
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
    @objid ("831aacc3-e97e-4b9b-8b15-6e3e846ae811")
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

    @objid ("10ec7ba9-ee8d-42e8-afb3-2ec6f07c196a")
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
    @objid ("81b2154a-ec02-435a-a517-15d4069209f8")
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
    @objid ("d5884482-d510-45b6-ba76-fa4a042d7f80")
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

    @objid ("4a335cdf-fdb3-482e-b83d-3ca56bb5ff32")
    protected Hosting(final Connector elt) {
        super(elt);
    }

    @objid ("71058a75-05c8-4604-b534-ff2d31f52287")
    public static final class MdaTypes {
        @objid ("c16a0bc5-c3f2-4777-925c-e07c262dc8d1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae17f24c-8587-46a4-bfce-5f25059e000f")
        private static Stereotype MDAASSOCDEP;

        @objid ("056c97f7-d782-46c5-a9c3-73c90adc9ba6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87912997-0a70-4144-aa15-ed9f145a6a15")
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
