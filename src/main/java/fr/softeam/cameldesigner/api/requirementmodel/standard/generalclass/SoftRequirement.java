/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << SoftRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("539e2a12-8c48-42f5-9783-5248ca11085c")
public abstract class SoftRequirement extends Requirement {
    @objid ("b43be6d8-af1b-44f8-8f82-4219cabbdf69")
    public static final String STEREOTYPE_NAME = "SoftRequirement";

    @objid ("24788461-6a07-43bb-b63f-8c9e8800a224")
    public static final String PRIORITY_TAGTYPE = "priority";

    /**
     * Tells whether a {@link SoftRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << SoftRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9bdd2afe-77c6-452b-9c9a-7056aeb90654")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftRequirement.STEREOTYPE_NAME));
    }

    @objid ("f8bfe52f-635d-4bf7-9ede-5d46b9bc89e5")
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
        SoftRequirement other = (SoftRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}.
     * 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("cb2f3a69-5891-491c-b97f-c10d6fd98ab1")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    /**
     * Getter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e42873fc-6e44-4697-9689-49eecc90e40a")
    public String getPriority() {
        return this.elt.getTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT);
    }

    @objid ("90020117-ed71-4831-9c6e-8c4d72bb3cb0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5382ddca-1987-4ecb-8441-8f84bef0d57e")
    public void setPriority(final String value) {
        this.elt.putTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT, value);
    }

    @objid ("4e195c55-e872-4135-ba88-5cfc0cf2db22")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("2cf57745-a538-4f46-8372-f9470c457945")
    protected SoftRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("e11f1b31-a2cb-4b0a-a55c-c134d2473491")
    public static final class MdaTypes {
        @objid ("b4fa144d-a32c-4c39-8454-a76120a9e741")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fd63c27-4846-4883-9b87-5858473cf1f3")
        public static TagType PRIORITY_TAGTYPE_ELT;

        @objid ("1e3e1947-603f-4d5c-8b48-40d59906a458")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a6ebce1-8549-45e5-91ca-9df086d621c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16a3021a-01ab-4437-a18c-eda9b5d4ddad")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc1abdeb-e2fa-4a04-9253-4e15a223bce2");
            PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f38e006-1584-4036-8ddc-f39a5b607306");
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
