/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("820f65dd-4de6-4c07-bea1-337af048cb5b")
    public static final String STEREOTYPE_NAME = "Feature_Class";

    /**
     * Tells whether a {@link FeatureClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Feature_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2bd4423d-87c4-41d8-8392-6fd142f35497")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Feature_Class >> then instantiate a {@link FeatureClass} proxy.
     * 
     * @return a {@link FeatureClass} proxy on the created {@link Class}.
     */
    @objid ("e0578dd7-e324-44ba-a912-1dfeb1b6fdc1")
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
    @objid ("59be032d-c86f-4a3a-a560-84ebf30d4691")
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
    @objid ("f9cf3621-d407-4837-8080-dcf9450e18aa")
    public static FeatureClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj))
        	return new FeatureClass(obj);
        else
        	throw new IllegalArgumentException("FeatureClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ffb45fa-12a2-43b0-9eeb-15b29abbfcfb")
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
    @objid ("255b8efd-30a8-4ec1-8413-11bc2d960bd0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("24d410b9-41b1-4157-a7bc-8acc71fc99f1")
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

    @objid ("afefd385-45de-4e9d-a429-fb4ff3a40845")
    protected FeatureClass(final Class elt) {
        super(elt);
    }

    @objid ("266313b7-34b2-4846-a164-b64005a3816f")
    public static final class MdaTypes {
        @objid ("dcf70d46-f1f2-4953-83e1-a8da589534a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c14caae-950c-4764-af2d-c205db996852")
        private static Stereotype MDAASSOCDEP;

        @objid ("425784b6-73ef-4a3b-8de1-23c4a2d5f41f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63abb1dd-074c-4586-b600-cb997d035ac5")
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
