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
@objid ("4dd9e328-ae57-42da-a8da-56b8cb852d23")
public class ActionInstance extends Feature {
    @objid ("6ec58172-9da7-4c4f-9975-27d07e279057")
    public static final String STEREOTYPE_NAME = "ActionInstance";

    @objid ("df0d3a88-b7f3-4c52-ab5c-ea459aee609a")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("c40d80eb-0cb6-4731-bcdb-af19d20f7374")
    public static final String STARTTIME_TAGTYPE = "startTime";

    @objid ("5ff6714d-7849-4e27-b887-2265e4cf1a9d")
    public static final String SUCCESSFUL_TAGTYPE = "successful";

    /**
     * Tells whether a {@link ActionInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ActionInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc6faa8e-d017-4246-b65f-9391169dd9a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ActionInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ActionInstance >> then instantiate a {@link ActionInstance} proxy.
     * 
     * @return a {@link ActionInstance} proxy on the created {@link Class}.
     */
    @objid ("085a0fe3-d285-4c0d-bebe-166c8c1afdf2")
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
    @objid ("6ecb55aa-e4b3-4c38-8823-d5398d79a5ad")
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
    @objid ("3d72bca7-df03-4a0d-9b92-1944f707f3a9")
    public static ActionInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ActionInstance.canInstantiate(obj))
            return new ActionInstance(obj);
        else
            throw new IllegalArgumentException("ActionInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("766ef7ce-9082-41b6-98a0-f892b82cb1b0")
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
    @objid ("d3a8e4e4-6385-4afa-b12c-d4c666561a9c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b54748a8-977e-4b06-be1b-afeb46568750")
    public String getEndTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb238603-850c-41a5-b765-72fc557cd06c")
    public String getStartTime() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4f2cbfac-380c-4aa1-bc15-be3b616d01d3")
    public String getSuccessful() {
        return this.elt.getTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT);
    }

    @objid ("b9b730ed-040c-4875-8d2e-f4970a6a60c9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eec78fd3-18c9-49df-94dc-ca1eba9378a2")
    public void setEndTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("424b0d73-768a-4c99-8b1f-a9de9bdaeeba")
    public void setStartTime(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'successful'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6cc61b71-1730-4d75-8705-eb65f437e402")
    public void setSuccessful(final String value) {
        this.elt.putTagValue(ActionInstance.MdaTypes.SUCCESSFUL_TAGTYPE_ELT, value);
    }

    @objid ("8341ba35-7fc9-494e-ba86-3382dfc56876")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("cfed23b0-f57c-4162-9a81-7f28d0c10440")
    protected ActionInstance(final Class elt) {
        super(elt);
    }

    @objid ("3bcd3fe6-2807-419e-bfc4-1ddeb097c4b2")
    public static final class MdaTypes {
        @objid ("851a9672-7164-4289-a5bc-542b211d7e37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c709f3e5-7ef1-4d1f-b9a5-bf9e2058ac4e")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("e93a208b-45e0-46d6-9543-0c0326f529b9")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("5a1cb957-29a1-4a9b-ad3d-2575aa5c697a")
        public static TagType SUCCESSFUL_TAGTYPE_ELT;

        @objid ("374030cf-a898-45e5-92cb-283eda654911")
        private static Stereotype MDAASSOCDEP;

        @objid ("a5c72ea0-1ee7-4114-a3ff-20bba554d7ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ca5c7322-c2b5-4422-b511-f1ce71bf805b")
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
