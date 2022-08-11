/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << OrganisationModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8d78609e-ed7f-45f1-93ed-a1fab4832f6e")
public class OrganisationModelDiagram extends AbstractCamelDiagram {
    @objid ("4459cfac-a91d-4507-b1aa-7bd2f32b2354")
    public static final String STEREOTYPE_NAME = "OrganisationModelDiagram";

    /**
     * Tells whether a {@link OrganisationModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fdc0a182-9260-4359-906e-30e3dcdef93c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> then instantiate a {@link OrganisationModelDiagram} proxy.
     * 
     * @return a {@link OrganisationModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("2c09f822-ffe4-4707-8c36-8a1b30a080e9")
    public static OrganisationModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModelDiagram.STEREOTYPE_NAME);
        return OrganisationModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link OrganisationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link OrganisationModelDiagram} proxy or <i>null</i>.
     */
    @objid ("01fa1411-6e2f-4f80-92c7-1bc73ad9e056")
    public static OrganisationModelDiagram instantiate(final ClassDiagram obj) {
        return OrganisationModelDiagram.canInstantiate(obj) ? new OrganisationModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrganisationModelDiagram} proxy from a {@link ClassDiagram} stereotyped << OrganisationModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link OrganisationModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f8c93c96-0044-4e6d-9ae1-91172acf8b9d")
    public static OrganisationModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (OrganisationModelDiagram.canInstantiate(obj))
            return new OrganisationModelDiagram(obj);
        else
            throw new IllegalArgumentException("OrganisationModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("10657488-ffdd-4d76-932f-a45f05ce6a2f")
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
        OrganisationModelDiagram other = (OrganisationModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("9f6e1c5c-6cc3-48b1-b438-9ac0f26c91db")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("1eb19ca8-8241-488c-90d6-8f664119231a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b15584df-f081-43d8-9bed-39e490da4b52")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("9c7a4b1e-a44d-4487-8558-3275d7fd337b")
    protected OrganisationModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("194a89db-0a89-413a-af39-44bf5446c768")
    public static final class MdaTypes {
        @objid ("5ac5eaa0-61c1-4dc2-be75-740896479b9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2bbd16e5-238f-4e94-8bb8-d9835d4f8c7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d5e07c8a-9cf3-42fe-9039-ffb22ef2ea47")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a43eedd6-b42b-42fe-95b9-49035c4627ca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "866330db-6440-4bbe-bd93-4bb567e8f1e7");
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
