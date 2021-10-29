/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.04

 * This file was generated on 10/19/21 2:54 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ActionInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a76b8220-83aa-410e-a6dc-9369e64f59e2")
public class ActionInstance extends Feature {
    @objid ("96418db0-219e-44c9-95e2-bc378a14560b")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("7d2276a7-1973-4b24-9e8f-2f6e63c564ef")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("68616b1e-a9fc-4db6-8766-6c56beac0c77")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("8b458e49-f2bd-46c3-8e3d-03eb4bd6100b")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b87e5962-ef67-40f5-a010-a25772b0ce89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Class}.
     */
    @objid ("c288278e-d3f0-495f-9813-9ea477ded780")
    public static ActionInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME);
        return ActionInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Class} stereotyped << ActionInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ActionInstance} proxy or <i>null</i>.
     */
    @objid ("a1ddfa7d-198e-4ae9-8f84-95547c2a4999")
    public static ActionInstance instantiate(final Class obj) {
        return ActionInstance.canInstantiate(obj) ? new ActionInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ActionInstance} proxy from a {@link Class} stereotyped << ActionInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ActionInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e831a93c-34a5-45a7-bab7-dfd3d487b9d9")
    public static ActionInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
            return new ActionInstance(obj);
        else
            throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5607ff6d-e00a-42e0-b0ac-e3180f5afd65")
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
        ActionInstance other = (ActionInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a6da9762-de92-4862-b93e-8088458c8f67")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("810b7664-1151-4cf4-b065-b8fbde9dfbd6")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1df98613-5a91-43d4-8841-369367dae693")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2553642-1844-40fe-81cf-dcf829b22e8e")
    public String getSuccessful() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    @objid ("c4b1cad0-596a-493b-9444-4d3b20f26844")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("13c59506-5c02-4f30-99fc-1be4e48c9151")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("edab3bfe-5749-4125-950a-f824c9354485")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07a6332b-272f-4c4e-9021-40c9c034e17d")
    public void setSuccessful(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT, value);
    }

    @objid ("962e40b9-4a8c-4a85-9df3-765b8a3c2fec")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("f8508e2a-62fd-4559-9d9c-d142d58c7d70")
    protected ActionInstance(final Class elt) {
        super(elt);
    }

    @objid ("e6124144-40b2-4d8e-9200-f628fda5f4f2")
    public static final class MdaTypes {
        @objid ("77d4155e-8e70-479c-a802-08630b33007a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4338db55-46ab-49f5-9730-621eeb0cd793")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("edc0ab92-f05d-47c2-aee6-a5dddad2b650")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("90cdb52b-614f-4bd2-a63f-ff3ac07f3ce0")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("a2321a3f-236c-4e1f-a714-44b243e3a66b")
        private static Stereotype MDAASSOCDEP;

        @objid ("d30e254a-5839-4678-934c-7ab94cc20a19")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a56cbe06-65b0-4e62-9bd5-c5b28e1aa25a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe6343f1-1474-4d9e-a80f-e88b019c9e46");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0fbf0b8-55e7-49bd-8638-48285c121023");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0d29654-1e13-4705-af26-e7bcf590850e");
            SUCCESSFUL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "652d15c6-5261-493e-a968-b981d7bee54a");
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
