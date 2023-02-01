/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
 * Proxy class to handle a {@link ClassDiagram} with << TypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1573d2fb-b10e-4c0a-bdc5-26ed12c40524")
public class TypeModelDiagram extends AbstractCamelDiagram {
<<<<<<< HEAD
    @objid ("1b133dd8-ea88-41ac-b082-261edd7c61b2")
=======
    @objid ("6fb3ecc5-41de-4df5-a82d-907d97d041f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "TypeModelDiagram";

    /**
     * Tells whether a {@link TypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << TypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("90a9ca9a-58d9-41b0-b4be-143e8b26bda7")
=======
    @objid ("965be067-e530-4153-a2a5-44bdcec6e5b8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << TypeModelDiagram >> then instantiate a {@link TypeModelDiagram} proxy.
     * 
     * @return a {@link TypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
<<<<<<< HEAD
    @objid ("faaa8d2d-bb0b-4d24-a51d-0c29e828606c")
=======
    @objid ("af6a9b54-10b0-45c7-a1e7-718b104c03e6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME);
        return TypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link TypeModelDiagram} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("43c44f3a-3653-4c29-9e38-e3b699b34c40")
=======
    @objid ("d5da7658-3606-4d8c-ade8-2121fe46aa46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModelDiagram instantiate(final ClassDiagram obj) {
        return TypeModelDiagram.canInstantiate(obj) ? new TypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link TypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("4fead9cb-ca70-41a2-8abc-3b5eb391ede1")
=======
    @objid ("cd9eef7c-a2a9-48e8-b961-864ef811da3d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (TypeModelDiagram.canInstantiate(obj))
        	return new TypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("TypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("75ee7cc3-f516-4651-ad14-959ed14d8ae4")
=======
    @objid ("bfecab4c-7673-4847-a9ae-1b0686725966")
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
        TypeModelDiagram other = (TypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c5cc9256-1030-400a-bf54-9b87b427ddc0")
=======
    @objid ("49bdd5fc-3500-4388-b1f3-3f1bdbae30cb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

<<<<<<< HEAD
    @objid ("3dbdccd8-2e1c-4bc8-b9e3-2276dc7b8bf4")
=======
    @objid ("4dcd9b1b-b906-435c-960b-bcd2f0fa51d0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a8c56d0d-d911-4a2a-b83f-55619771a65c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("c5b3787a-68e0-4b2d-a870-f5408a4e4fe3")
=======
    @objid ("aa031714-40ba-49ef-a004-33b1956a4a65")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected TypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("be25d91d-24c1-40f8-ab27-4d81ae2fa976")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("04d7cdcc-755e-43a2-adf4-d8ee4718ca14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80b94a38-9368-4e80-964c-5c74cfad9db0")
        private static Stereotype MDAASSOCDEP;

        @objid ("92951b93-e23a-455e-aec2-4a5ab8f2f0aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("748e1386-77fd-42fb-afe6-e5bddc841d49")
=======
        @objid ("540abab0-b878-4716-9636-e3a3b2d31f32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("575d9dac-43b6-4047-9b9e-3f2c5b9b1089")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd759d7a-e85b-4e6b-b6b3-62f0a13d39f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22d4f16c-88b7-4cd1-8455-7c82f371b6a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e909af8e-708a-490e-886c-55037a9674e1");
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
