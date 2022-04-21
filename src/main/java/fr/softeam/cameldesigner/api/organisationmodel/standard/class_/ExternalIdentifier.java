/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << ExternalIdentifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("facd10dc-f6ab-44d0-b526-c83be089740a")
public class ExternalIdentifier extends FeatureClass {
    @objid ("a47c67ce-ab3a-4d0a-af4c-32f6d96f2d2a")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("f7abeaad-4e5a-40f1-aae1-0d2b8dce6972")
    public static final String IDENTIFIER_TAGTYPE = "identifier";

    /**
     * Tells whether a {@link ExternalIdentifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ExternalIdentifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5457ca98-7303-4bb3-a20a-6e7f004f78c4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ExternalIdentifier >> then instantiate a {@link ExternalIdentifier} proxy.
     * 
     * @return a {@link ExternalIdentifier} proxy on the created {@link Class}.
     */
    @objid ("76d1a74c-2de1-4689-96d8-91adaf530752")
    public static ExternalIdentifier create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME);
        return ExternalIdentifier.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ExternalIdentifier} proxy or <i>null</i>.
     */
    @objid ("20b2cd0b-b0ef-4a98-a91b-e3f26e1f0753")
    public static ExternalIdentifier instantiate(final Class obj) {
        return ExternalIdentifier.canInstantiate(obj) ? new ExternalIdentifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ExternalIdentifier} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("967af0c7-90ec-4be8-9e27-a404b2a13663")
    public static ExternalIdentifier safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ExternalIdentifier.canInstantiate(obj))
            return new ExternalIdentifier(obj);
        else
            throw new IllegalArgumentException("ExternalIdentifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5306fb16-7fd6-413e-91e6-ce544ebec4b4")
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
        ExternalIdentifier other = (ExternalIdentifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f2824711-8773-4adc-943b-29fc25f663a3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("195d1017-1124-4d91-9877-6c003b16cbab")
    public String getIdentifier() {
        return this.elt.getTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT);
    }

    @objid ("e68a2d97-bf75-4214-b4af-ab8023b75594")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c87025b6-baa2-458d-a06b-60aef1af2693")
    public void setIdentifier(final String value) {
        this.elt.putTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT, value);
    }

    @objid ("c294416b-d255-4cbe-a4d8-e075b9226e35")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("92a380e7-2c40-4c7b-b9d6-3ae8557a9bcf")
    protected ExternalIdentifier(final Class elt) {
        super(elt);
    }

    @objid ("c29cec98-a116-4fff-9165-be962105e0ad")
    public static final class MdaTypes {
        @objid ("7d3b1f79-bf22-4ff1-8515-b48019787a1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db9c9c64-e014-4dad-9d07-67fbe4ec428a")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("746a5178-d0e6-4044-b4c0-c7396ae6ff19")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ef9cddf-73f5-4961-9aed-c7de4e2eb2b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b15c8628-7ad7-4aa5-8e62-75239f67133c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9e9641f0-08c0-4453-a828-314b9d3e7682");
            IDENTIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79f66d2e-b870-4d06-81b9-8851077fb522");
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
