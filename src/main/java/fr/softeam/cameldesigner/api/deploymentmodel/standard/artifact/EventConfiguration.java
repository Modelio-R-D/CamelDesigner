/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("4dc297e6-d56e-4a8e-bcbe-a2af5fbc4a48")
    public static final String STEREOTYPE_NAME = "EventConfiguration";

    @objid ("211ceaa4-6bc5-4b1a-a60e-56a2a82a2191")
    public static final String HTTPMETHODNAME_TAGTYPE = "httpMethodName";

    @objid ("4b81460d-b570-4b59-8df4-709ee12302a1")
    public static final String HTTPMETHODTYPE_TAGTYPE = "httpMethodType";

    /**
     * Tells whether a {@link EventConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << EventConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5a035dbb-2e6c-4a37-9934-4fb8901e0843")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << EventConfiguration >> then instantiate a {@link EventConfiguration} proxy.
     * 
     * @return a {@link EventConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("c0716995-45d8-4dcd-b712-e2e34cdde33f")
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
    @objid ("6e3fa724-73df-43b9-969b-f879978ddfdb")
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
    @objid ("5d1e47d2-356e-486d-9d6b-0e79fb11ce83")
    public static EventConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (EventConfiguration.canInstantiate(obj))
        	return new EventConfiguration(obj);
        else
        	throw new IllegalArgumentException("EventConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0913bf84-72d3-41df-84c9-989030b81bd5")
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
    @objid ("8875b43b-a974-4118-b5d0-6edec97be217")
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
    @objid ("caa523e0-1a80-4c12-82a4-271e5455618a")
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
    @objid ("bebfad86-d94b-4c1d-8b23-b3c28c70c8d1")
    public String getHttpMethodName() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("19d58971-8bc9-4df3-96a7-379bd718e741")
    public String getHttpMethodType() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("80b01430-317a-4ce6-86fe-e376d0a1bf32")
    public FeatureClass getScheduledExecutionConfig() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Artifact) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

    @objid ("b9e4e472-963c-4afe-82d6-cfa9a103d38d")
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
    @objid ("11dbc3de-cf3c-4b22-9a3c-a8ddcbac8918")
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
    @objid ("7131d512-d83b-46d5-8829-ad67bceda2aa")
    public void setHttpMethodName(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("95407ab0-1d35-479b-98f0-7aee9c34cf1f")
    public void setHttpMethodType(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("394efbfa-bbb5-46a2-b02a-f7215ea631ac")
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

    @objid ("8ed472ae-0125-492c-ac3f-55ba7204b05e")
    protected EventConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("daa7f0bf-b9d3-467f-a096-f7cf1f5b5ad2")
    public static final class MdaTypes {
        @objid ("8774888b-b6b7-46dd-8da2-0fbb4159d72b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c58ddd6-b544-4238-9d3a-cf6a5eb6b0a6")
        public static TagType HTTPMETHODNAME_TAGTYPE_ELT;

        @objid ("31775fb0-d6de-4149-a87c-83e645b95037")
        public static TagType HTTPMETHODTYPE_TAGTYPE_ELT;

        @objid ("c6c968b0-f9b5-4c78-8eaa-63fca583f020")
        private static Stereotype MDAASSOCDEP;

        @objid ("0137093c-f54d-488c-887c-928db1b95502")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b33ef448-69fe-4ece-bbe7-1c33ecd2559b")
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
