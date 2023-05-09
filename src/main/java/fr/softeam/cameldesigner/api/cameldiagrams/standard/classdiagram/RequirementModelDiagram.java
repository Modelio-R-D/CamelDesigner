/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("c2aff50c-f795-42b7-9543-e42af3c1cc0f")
    public static final String STEREOTYPE_NAME = "RequirementModelDiagram";

    /**
     * Tells whether a {@link RequirementModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << RequirementModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2bdf5152-31b5-4a06-806a-3ef09935874e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << RequirementModelDiagram >> then instantiate a {@link RequirementModelDiagram} proxy.
     * 
     * @return a {@link RequirementModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("628b40cf-4dee-44fa-bc23-67cf85eedf28")
    public static RequirementModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME);
        return RequirementModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link RequirementModelDiagram} proxy or <i>null</i>.
     */
    @objid ("c3b035b2-e786-40ec-af68-9a71d2b57df1")
    public static RequirementModelDiagram instantiate(final ClassDiagram obj) {
        return RequirementModelDiagram.canInstantiate(obj) ? new RequirementModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link RequirementModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f59d8217-ca0c-4d93-9e55-4d3e71885cc0")
    public static RequirementModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (RequirementModelDiagram.canInstantiate(obj))
        	return new RequirementModelDiagram(obj);
        else
        	throw new IllegalArgumentException("RequirementModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c797cdc7-e97a-4510-b9c6-9764a6b14608")
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
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("1aa1d758-545d-4161-a955-add52f80fa24")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("0a1d8ae1-1b94-45f3-9bc6-3259e934244d")
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

    @objid ("f91216f4-708f-44cb-a94e-1d46f98389a0")
    protected RequirementModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b49732d9-0960-4c1f-a15a-9b345f5f99f2")
    public static final class MdaTypes {
        @objid ("976bcd61-d324-4021-95ea-0f0e8faafb44")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b801d2c-9cec-4d31-b75b-d13123dfb6db")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad1500fb-034c-4245-8c43-7560b7d28452")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4309e528-f962-447d-88a3-a3920cc8789c")
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
