/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << EventConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7162d5d-ed91-4ada-8780-ceae18efea97")
public class EventConfiguration extends FeatureArtifact {
    @objid ("c505d510-8a96-4ee4-aa32-fb36f9f28311")
    public static final String STEREOTYPE_NAME = "EventConfiguration";

    @objid ("42efa4b1-6ff0-40a2-9afb-722e44166e75")
    public static final String HTTPMETHODNAME_TAGTYPE = "httpMethodName";

    @objid ("cf5de701-b04a-4ac3-b103-1b56d5ac5196")
    public static final String HTTPMETHODTYPE_TAGTYPE = "httpMethodType";

    /**
     * Tells whether a {@link EventConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << EventConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d7558c80-f7b0-4186-a04b-c017573fe67a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << EventConfiguration >> then instantiate a {@link EventConfiguration} proxy.
     * 
     * @return a {@link EventConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("eb90cdbe-b67d-4909-89b7-20a9eab58321")
    public static EventConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME);
        return EventConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link EventConfiguration} proxy from a {@link Artifact} stereotyped << EventConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link EventConfiguration} proxy or <i>null</i>.
     */
    @objid ("342614fd-5dd4-4f4d-9a3e-c5a26160e69b")
    public static EventConfiguration instantiate(final Artifact obj) {
        return EventConfiguration.canInstantiate(obj) ? new EventConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link EventConfiguration} proxy from a {@link Artifact} stereotyped << EventConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link EventConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6360f9d1-4888-418a-a789-01860c2db8fe")
    public static EventConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (EventConfiguration.canInstantiate(obj))
        	return new EventConfiguration(obj);
        else
        	throw new IllegalArgumentException("EventConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("76aeb877-23e1-4c8b-94a8-308cb95c52a3")
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
        EventConfiguration other = (EventConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("bee47f8b-f98b-4927-94d5-1e469e374126")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the value of the 'executionSchedule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2f56d9f2-cc4c-46ea-afe8-f97fe6856487")
    public Schedule getExecutionSchedule() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(EventConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(EventConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "executionSchedule")){
                  if (Schedule.canInstantiate(d.getDependsOn()))
                     return (Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'httpMethodName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc9dadfd-b3ba-43e4-b922-73b37877f4d7")
    public String getHttpMethodName() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aad389c5-ea0f-494f-a8df-2d1a3285d723")
    public String getHttpMethodType() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8e4b4c97-25df-4954-95c8-8a4bcc629e71")
    public FeatureClass getScheduledExecutionConfig() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Artifact) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

    @objid ("2963b9ec-0fe0-4162-9229-a84415136ecb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'executionSchedule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d513b53b-8023-4db2-a030-fd022ee9fc22")
    public void setExecutionSchedule(final Schedule obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(EventConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(EventConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "executionSchedule")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), EventConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("executionSchedule");      dep.putTagValue(EventConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "executionSchedule");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'httpMethodName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16c1c346-e55f-43a0-ae41-862b240932fa")
    public void setHttpMethodName(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cca9eba4-1e97-45ee-9e44-4dc4314661cb")
    public void setHttpMethodType(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7cf5bbd6-f5d0-4a88-82ac-672a0a3bbdc5")
    public void setScheduledExecutionConfig(final FeatureClass obj) {
        ((Artifact) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("daa204fc-3327-454f-ae82-5500f1a86f8e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("65b645ab-aa18-43f7-859e-c94117632e6e")
    protected EventConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("daa7f0bf-b9d3-467f-a096-f7cf1f5b5ad2")
    public static final class MdaTypes {
        @objid ("19bca8d5-47ac-4f20-a83c-fd708ec86ad1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32b420c8-4eee-4084-8da0-95d0d9d55e6a")
        public static TagType HTTPMETHODNAME_TAGTYPE_ELT;

        @objid ("8e5a3d75-54c9-41bf-9c37-a4de50ac9bb2")
        public static TagType HTTPMETHODTYPE_TAGTYPE_ELT;

        @objid ("75d9585f-cbfc-493a-9c67-5d572f594000")
        private static Stereotype MDAASSOCDEP;

        @objid ("796b1a19-e18b-4b6f-95bd-85f9573a4602")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7664161d-51d4-4ce9-ac96-a9b54c0343b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5138fe5c-0bae-4c49-9442-c6ac48dd09d8");
            HTTPMETHODNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06feb07e-1378-4f53-8ae2-7ba21ca97283");
            HTTPMETHODTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6e019c4-7a53-4b8f-8ce5-bc2c0bf22328");
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
