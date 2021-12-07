/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << StringValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("108ceff7-c9cf-4dcb-8e30-e9a6e0322996")
public class StringValue extends Value {
    @objid ("90aa4488-400b-4bcd-9e7a-47802c2d0caf")
    public static final String STEREOTYPE_NAME = "StringValue";

    @objid ("b1170a6c-8e67-478a-bf04-3795684521bd")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link StringValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << StringValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e0e2477-7cf9-477b-a33d-319fb8b37265")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << StringValue >> then instantiate a {@link StringValue} proxy.
     * 
     * @return a {@link StringValue} proxy on the created {@link Class}.
     */
    @objid ("d86c252f-1216-446d-a86c-b43d77ed3f74")
    public static StringValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValue.STEREOTYPE_NAME);
        return StringValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link StringValue} proxy or <i>null</i>.
     */
    @objid ("ac650977-541f-4465-9a56-108254b79907")
    public static StringValue instantiate(final Class obj) {
        return StringValue.canInstantiate(obj) ? new StringValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValue} proxy from a {@link Class} stereotyped << StringValue >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link StringValue} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b75a2883-fb05-4d8c-91f7-9cf3086e970f")
    public static StringValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (StringValue.canInstantiate(obj))
            return new StringValue(obj);
        else
            throw new IllegalArgumentException("StringValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0f517773-9d0a-4901-97ab-718f75c05216")
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
        StringValue other = (StringValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("34bb63cf-07bb-4ad7-b146-b02f41ef16b3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38b54882-048b-49b4-8331-4453011a66c7")
    public String getValue() {
        return this.elt.getTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("2d2cfccf-175b-416c-8cf6-6cc2d4053784")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("47aac76a-bc29-4e19-ac05-cf39a11cfeff")
    public void setValue(final String value) {
        this.elt.putTagValue(StringValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("fbf8170a-d361-49e7-9be1-ff3a03fe2929")
    protected StringValue(final Class elt) {
        super(elt);
    }

    @objid ("9399a459-61a5-4415-942d-4d13e631e29a")
    public static final class MdaTypes {
        @objid ("cefb7b70-a715-4c2f-b845-6b01f24c1e20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("13a86a90-86b1-4374-9f88-d06487cbedae")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("8fc89038-b443-441a-b874-8073bfc7a143")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6a2e555-a7d0-46c9-bd15-1ab943b961c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3c1e5e3-2619-4c29-8c71-c6370ec67b32")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6150e77e-8a8a-40f6-9270-79aa182fc926");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dc99a44c-debc-43d9-a8f2-cf3b62a7138f");
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
