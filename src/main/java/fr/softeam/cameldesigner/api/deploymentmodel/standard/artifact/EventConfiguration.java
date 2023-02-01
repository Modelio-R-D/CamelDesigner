/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a43629c9-eaa7-44b4-b60f-9dd345397150")
    public static final String STEREOTYPE_NAME = "EventConfiguration";

    @objid ("91336444-b84e-4546-b2b6-46096f3b1e90")
    public static final String HTTPMETHODNAME_TAGTYPE = "httpMethodName";

    @objid ("d9ca2721-02c4-491a-980a-1efe6d66f091")
=======
    @objid ("fff7b480-acc1-4bec-be3a-2268bf671f66")
    public static final String STEREOTYPE_NAME = "EventConfiguration";

    @objid ("c9fb8a24-03da-4bd2-b6b6-aedbcea4a409")
    public static final String HTTPMETHODNAME_TAGTYPE = "httpMethodName";

    @objid ("92a72263-b1b5-4d13-bb29-7e72067abb45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String HTTPMETHODTYPE_TAGTYPE = "httpMethodType";

    /**
     * Tells whether a {@link EventConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << EventConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8513b81d-e8d6-4945-a111-956bbf0c4fa0")
=======
    @objid ("5936d5bc-0a05-46c6-b5c2-28d27ce188ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << EventConfiguration >> then instantiate a {@link EventConfiguration} proxy.
     * 
     * @return a {@link EventConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("1c0f958e-7577-4775-a4e2-3b4a6b33cb27")
=======
    @objid ("e4881a96-80e3-4ae4-83aa-ef4942b94e26")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ada91d78-1932-401c-b463-66124b0d9420")
=======
    @objid ("3113633a-1b74-4d08-9927-e235ddba7f0d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("694c7b2e-6e50-421d-aaef-d45c85586c1e")
=======
    @objid ("fb0d2f4e-ca55-4a02-8718-5d2d0cfac1d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static EventConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (EventConfiguration.canInstantiate(obj))
        	return new EventConfiguration(obj);
        else
        	throw new IllegalArgumentException("EventConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("c1c5e9b3-ba3a-4a16-8625-26fe0b422568")
=======
    @objid ("9315cac2-992f-4694-9614-8b192d2f8bd4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7006ba8c-d126-497d-a622-0eb36f9b23c0")
=======
    @objid ("e644f4d6-1c91-4804-bc45-63716d8ba0b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6ef63eb1-da57-489e-b10f-505eee5e836c")
=======
    @objid ("eb96a120-8980-411d-ad12-a436523d50a0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e5e37f7a-bcb7-4edb-8ba4-a49769ee94fc")
=======
    @objid ("2ec42ac4-650e-4889-a276-1ed53640f43a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getHttpMethodName() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("354fd67c-2d18-448f-ab5f-64ad5bf72d81")
=======
    @objid ("c37bfa6a-21a3-4ffc-902d-c504553c5ed5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getHttpMethodType() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5f4be2c3-8a97-4c45-88c9-b2c0e39e969a")
=======
    @objid ("67a2c088-1a3d-4d5f-8471-e6a40e953699")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public FeatureClass getScheduledExecutionConfig() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Artifact) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("6d356b6d-3c6d-4169-959f-36cb647eebd2")
=======
    @objid ("0bce43cf-3ed7-4245-a07c-1d8866cc5ef0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b9a0a557-2026-440c-a1b7-a393e0311370")
=======
    @objid ("bdbbde20-4731-4360-a9d3-3841eba7d016")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ed0f8a6e-dbbd-491b-9d1f-1c52a6c8e90e")
=======
    @objid ("ab3401a8-01aa-41d4-8506-e27152bfbbde")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setHttpMethodName(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6ae08711-8e2f-400a-9a0e-2aaf3a534756")
=======
    @objid ("37949617-3d2e-4a1e-9e38-9ddcce758458")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setHttpMethodType(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'scheduledExecutionConfig' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7e1da3bc-8005-439c-8d57-4168c83bffc5")
=======
    @objid ("3ed4407f-e5d4-4e66-b116-10cd411757b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("ecf72580-db6d-4d22-8cee-49a12fb46bf2")
=======
    @objid ("3507db46-9f5b-412f-8a7c-5075e183750e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected EventConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("daa7f0bf-b9d3-467f-a096-f7cf1f5b5ad2")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("3191e530-2f54-468e-b64d-df107f9e5f85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16642119-5099-4192-a8fc-b9cfd59c1a38")
        public static TagType HTTPMETHODNAME_TAGTYPE_ELT;

        @objid ("4b5fdb9a-8cda-4cf4-b817-0eba9bc86651")
        public static TagType HTTPMETHODTYPE_TAGTYPE_ELT;

        @objid ("a6ed1eb0-49ee-4521-86a0-a788f897b243")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f0a9247-00b3-4be4-94bf-b2fc3173cea1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e36a1270-8f60-4002-9b80-f516f1aa8450")
=======
        @objid ("dfb6c830-25a2-4f01-80ae-1374ff94ac1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e006265-c72c-406d-a20e-a4a8d47282f5")
        public static TagType HTTPMETHODNAME_TAGTYPE_ELT;

        @objid ("af20a31c-e491-4553-9424-d1ed08ae4401")
        public static TagType HTTPMETHODTYPE_TAGTYPE_ELT;

        @objid ("284c576b-e81d-4953-95f1-9d46da31f5fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb58233f-8bab-4d17-9003-541ba2f331b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("39565a61-a262-4fe0-ab03-d69fe48c7ae7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
