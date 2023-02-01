/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
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
 * Proxy class to handle a {@link Class} with << Feature_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6a4c36bc-3125-4731-8439-e795625943d2")
public class FeatureClass extends FeatureClassifier {
<<<<<<< HEAD
    @objid ("73ccfc79-d369-4f4e-a8ff-0ea5fc49c4f8")
=======
    @objid ("cd7a5917-2b51-4a52-b6c1-59c7f7034bfa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Class";

    /**
     * Tells whether a {@link FeatureClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Feature_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("6201f7ca-fb85-49a1-88a9-296bd9b280d0")
=======
    @objid ("a04d75ba-7ac3-4b28-8213-c8c90640bbad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Feature_Class >> then instantiate a {@link FeatureClass} proxy.
     * 
     * @return a {@link FeatureClass} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("67de7d74-2470-4da5-b305-1e70ad3200eb")
=======
    @objid ("9275a855-bbaa-41e5-8174-c89e624e61cb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME);
        return FeatureClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("5280e969-ff66-4972-b711-0b31673a4e45")
=======
    @objid ("8805d50c-bff1-4912-af62-722618f5abfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureClass instantiate(final Class obj) {
        return FeatureClass.canInstantiate(obj) ? new FeatureClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FeatureClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("9a909820-bc08-4071-a14d-ca7d18dcaeae")
=======
    @objid ("9440233b-993c-4089-9340-2edcf76bc729")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static FeatureClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj))
        	return new FeatureClass(obj);
        else
        	throw new IllegalArgumentException("FeatureClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("e1539c24-3d7f-4894-a2c4-ffe88b612da1")
=======
    @objid ("3b5786c1-9f5d-4ab6-b5c9-b55814040e08")
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
        FeatureClass other = (FeatureClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("cee29bdd-a603-4050-a416-ad616cd7adad")
=======
    @objid ("8c214335-ee1e-41c1-8810-1694282c15ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("c0b59dab-3202-4236-bac6-7805fdce0dcf")
=======
    @objid ("2f54efa4-4062-4daa-b6b9-a124402634ea")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6f2ed08a-f287-46db-9942-1543756215e1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("d80b1e52-cd4c-46f5-9d45-a7c93df86dfb")
=======
    @objid ("354a17d7-a0c7-4d62-95ec-b3d5234285cc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureClass(final Class elt) {
        super(elt);
    }

    @objid ("266313b7-34b2-4846-a164-b64005a3816f")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("914eef62-717c-4134-ab34-a707d2d6e856")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("035271ea-fa94-4cea-952b-8f1c16133b94")
        private static Stereotype MDAASSOCDEP;

        @objid ("96c40a56-b9db-4415-8b53-8df954fbdd0d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ad43107b-f1ec-42cf-a75b-99b3d081c595")
=======
        @objid ("cefd241b-07fe-43d9-8368-d4e2b846bb64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5ded3c4-b09c-4d7b-a330-f0ad925617a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("540008c2-be97-433a-a7e6-5227bc3f03d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e5ee6bd-73f0-4e57-8a6d-005df51ccf7a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "babf8276-c4d4-4d86-b02b-d20c6636d937");
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
