/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << RequirementModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c0f09b77-0e4b-430d-a7da-01382979d1a3")
public class RequirementModelDiagram extends AbstractCamelDiagram {
    @objid ("9f3b771a-6735-443e-ae60-fb5b587a3071")
    public static final String STEREOTYPE_NAME = "RequirementModelDiagram";

    /**
     * Tells whether a {@link RequirementModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << RequirementModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0e5690e1-fb5b-4ef8-ae3a-283a4fb857a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << RequirementModelDiagram >> then instantiate a {@link RequirementModelDiagram} proxy.
     * 
     * @return a {@link RequirementModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("6b5d6bb6-a5e5-45d6-8ed2-79637633b0e5")
    public static RequirementModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME);
        return RequirementModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link RequirementModelDiagram} proxy or <i>null</i>.
     */
    @objid ("1bc1c410-51df-4c08-82c5-4c72f43a2555")
    public static RequirementModelDiagram instantiate(final ClassDiagram obj) {
        return RequirementModelDiagram.canInstantiate(obj) ? new RequirementModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link RequirementModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("21e0104a-07c9-426e-8ad5-99e89b4608c6")
    public static RequirementModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (RequirementModelDiagram.canInstantiate(obj))
            return new RequirementModelDiagram(obj);
        else
            throw new IllegalArgumentException("RequirementModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("863ba344-bf8e-4955-b746-cb0e89e54091")
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
        RequirementModelDiagram other = (RequirementModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("d9c8af86-4d79-4e97-982c-0be2e64aea2f")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("cd7b5176-f328-4cd7-b7db-ddfb18389f20")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b1634cc6-b458-4c77-a363-aebccf9cb19d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("9b49cf8f-bbe0-428d-be0e-f24801ee86dd")
    protected RequirementModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b49732d9-0960-4c1f-a15a-9b345f5f99f2")
    public static final class MdaTypes {
        @objid ("cb729326-32b6-414d-b1be-8f0df347aee3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b2368126-bd93-4fbd-ad31-5b929b02d083")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f74ceb3-3940-46b7-97b8-da6ea79a281e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dba9bbc5-5cce-4d4b-915c-9de2f3a7c622")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8879e00-7139-4923-a7ff-67ebdb678e5b");
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
