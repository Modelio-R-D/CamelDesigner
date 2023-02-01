/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("93ecb915-3a5e-4576-b6fe-e38d22da9be0")
=======
    @objid ("c7fe8b44-86f7-4449-be64-43ec5bb03655")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Annotation";

    /**
     * Tells whether a {@link Annotation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Annotation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("441b7e3f-c916-4433-aa03-b26b95c0bd68")
=======
    @objid ("9d4ace74-372b-4201-b175-be796c126053")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Annotation >> then instantiate a {@link Annotation} proxy.
     * 
     * @return a {@link Annotation} proxy on the created {@link Dependency}.
     */
<<<<<<< HEAD
    @objid ("ec6027e2-5a9f-4808-8676-eeca0e70a0f4")
=======
    @objid ("2c12c35b-2592-49a1-9ea5-9bf9c89a4418")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Annotation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Annotation.STEREOTYPE_NAME);
        return Annotation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link Annotation} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("17b5137e-703d-42f1-a962-b4e329438d68")
=======
    @objid ("54154f5e-0e4b-4d55-a2bb-44bda24e918f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Annotation instantiate(final Dependency obj) {
        return Annotation.canInstantiate(obj) ? new Annotation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Annotation} proxy from a {@link Dependency} stereotyped << Annotation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link Annotation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("293f4fab-f712-45d0-9eb5-cb81eae9cef5")
=======
    @objid ("3e60e005-1e90-4897-8d4c-daa37d01af57")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Annotation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (Annotation.canInstantiate(obj))
        	return new Annotation(obj);
        else
        	throw new IllegalArgumentException("Annotation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("743974e2-6637-4e94-a450-944743386792")
=======
    @objid ("6ec1ac49-826e-4b3f-894b-ece4f62b896b")
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
        Annotation other = (Annotation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("19783350-0808-40f3-8507-d03af178c05f")
=======
    @objid ("ccf34a47-59ce-427c-86c7-fe1a4e33b20a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

<<<<<<< HEAD
    @objid ("233775b6-d22c-4530-9974-d3221cddb71a")
=======
    @objid ("2c543cec-1445-4aeb-9d8d-5b4037d5f033")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("ccf9a977-4634-4629-9877-f89a82edbd5b")
=======
    @objid ("b482a7ba-9eab-40fe-8ea6-44d70c8e8f0d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Annotation(final Dependency elt) {
        super(elt);
    }

    @objid ("e1806156-f5a9-4d39-9bb7-739c08fa2b43")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("1ab1c982-fea6-43a2-b856-f091ebae2308")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2449b9ef-1a80-4700-b15e-42cac462e39c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1f00ada-5511-4f09-b1e6-d234118d7c00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b09814b4-74d6-4f77-a92b-21ed066ddef0")
=======
        @objid ("8070eeb7-3cd3-43f4-ab11-ccf691fb682b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26eff804-6bad-4742-868e-1eb2be330336")
        private static Stereotype MDAASSOCDEP;

        @objid ("9bca8cf4-6197-426c-b628-363f5254bf89")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd11eb84-49fb-4156-a60c-258be842a28c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
