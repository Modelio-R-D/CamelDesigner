/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Dimensionless >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e9f9cd86-0e87-4d30-8dca-05407bf4faee")
public class Dimensionless extends Unit {
<<<<<<< HEAD
    @objid ("8c84a11b-2864-4ace-a661-44ec2ce33ceb")
=======
    @objid ("0d4edf50-98cc-4c35-aa3e-963dcfc0973f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Dimensionless";

    /**
     * Tells whether a {@link Dimensionless proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Dimensionless >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("83575a09-4365-4bb3-a293-7876bd16ad86")
=======
    @objid ("7e6cd6b9-b58e-45c0-9c24-340625b811a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Dimensionless >> then instantiate a {@link Dimensionless} proxy.
     * 
     * @return a {@link Dimensionless} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("9bb26556-b774-4284-8c1a-b867ff6ea0e5")
=======
    @objid ("fcfd4e96-281d-45de-ad46-497b947675f9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Dimensionless create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME);
        return Dimensionless.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link Dimensionless} proxy from a {@link DataType} stereotyped << Dimensionless >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link Dimensionless} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("4c5f2760-573b-453e-b483-37aedeb0f7c3")
=======
    @objid ("0e5ca45a-08f0-4fe9-9682-227264326f3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Dimensionless instantiate(final DataType obj) {
        return Dimensionless.canInstantiate(obj) ? new Dimensionless(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Dimensionless} proxy from a {@link DataType} stereotyped << Dimensionless >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link Dimensionless} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("b13ff9cc-27a7-44c9-a353-b2bbc1464b69")
=======
    @objid ("3391a2ae-1e9b-4406-b802-bc03b4202c1f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Dimensionless safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Dimensionless.canInstantiate(obj))
        	return new Dimensionless(obj);
        else
        	throw new IllegalArgumentException("Dimensionless: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ee43eddf-0664-4d56-8ebe-c528c32e625a")
=======
    @objid ("2bbf0dae-7dbb-4473-a287-0e852cb6859c")
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
        Dimensionless other = (Dimensionless) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("10dc52f2-f56c-4f23-abd6-de87fe985761")
=======
    @objid ("69ca5605-0b0e-43d8-a09d-9f58922b7735")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("f86d6e60-c20d-452b-81e4-02c17c586dee")
=======
    @objid ("ebf3f64e-dcf7-4f81-91f0-291cf674b6c4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6672b81b-cfe8-4e1b-9360-dffd714df46a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("b0ccf630-f653-4cb9-880a-7803887292f5")
=======
    @objid ("3f1899cb-f3cc-46ad-ba5e-b60625d85358")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Dimensionless(final DataType elt) {
        super(elt);
    }

    @objid ("1d70db3f-3af3-451e-8f06-2dfdde561927")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("687e7fc8-07b6-4961-9b0a-ccdb3bf1ec18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c8a6e04-6562-4a84-a018-466f1890401a")
        private static Stereotype MDAASSOCDEP;

        @objid ("cf49ea57-e5ee-43c5-a6e4-127b1e7ba9f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("41457ae1-3c0f-4e0b-b9f3-901d5707b0e1")
=======
        @objid ("6f76ea29-7a99-4724-b39b-34d172172917")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7976a3c8-7212-4d4e-977b-ab9974071041")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb82ce63-09d2-4c53-bc8b-590e1a96098d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c34c4d5-9651-4d88-a37e-0ad6cad47201")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4d98d5de-9085-4175-b509-30f88171f3ea");
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
