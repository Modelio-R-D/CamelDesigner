/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency;

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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << Annotation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7031d203-af8d-4031-b372-b418d6e60fbd")
public class Annotation extends CamelElement {
    @objid ("261436bf-32a6-4e3a-bc54-2721e3b2b7f4")
    public static final String STEREOTYPE_NAME = "Annotation";

    /**
     * Tells whether a {@link Annotation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Annotation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d099341-50f3-4aeb-834b-e040a07cffad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Annotation >> then instantiate a {@link Annotation} proxy.
     * 
     * @return a {@link Annotation} proxy on the created {@link Dependency}.
     */
    @objid ("878ce5a9-4e4e-48f5-8aee-f7491dab0325")
    public static Annotation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME);
        return Annotation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Dependency
     * @return a {@link Annotation} proxy or <i>null</i>.
     */
    @objid ("6ec613dd-58c7-411b-8aa8-3155cb293583")
    public static Annotation instantiate(final Dependency obj) {
        return Annotation.canInstantiate(obj) ? new Annotation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Dependency}
     * @return a {@link Annotation} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8796c410-7834-4dad-bcb9-b8e9bad2ae73")
    public static Annotation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (Annotation.canInstantiate(obj))
            return new Annotation(obj);
        else
            throw new IllegalArgumentException("Annotation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e98667d4-ad30-48ea-9e94-66711c8f0007")
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
        Annotation other = (Annotation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}.
     * 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("738a533f-0abc-4575-859e-bbcf2027e0e0")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("2ca93ec4-24cc-4213-89d9-bef57a78cca6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ce3e9a88-6dd5-4dcb-bc53-7158f2ed587d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d603f714-9942-4746-a957-633dda6b28e8")
    protected Annotation(final Dependency elt) {
        super(elt);
    }

    @objid ("e1806156-f5a9-4d39-9bb7-739c08fa2b43")
    public static final class MdaTypes {
        @objid ("1bc96f09-8599-4015-9fa5-b531fdac4924")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94edb417-4e7c-46bd-a752-164c3eb68c10")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e3f05dd-4f99-4db2-ab0f-5d414efe0901")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9cad5d06-ccea-48cd-a024-875dff1bb60d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6ac7f831-f2b4-447b-ba9e-e58f7834bcf7");
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
