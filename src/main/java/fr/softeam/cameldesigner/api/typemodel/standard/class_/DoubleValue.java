/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << DoubleValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc20daad-6f47-4d3a-babd-121eb172a4cb")
public class DoubleValue extends NumericValue {
    @objid ("b63fa3e2-12a1-4952-b177-4fc24540c649")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("7ab09a6e-1be3-4678-83a4-d23094cfaef8")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link DoubleValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DoubleValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("89750f34-3c65-493b-ae38-0eb1976bf612")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DoubleValue >> then instantiate a {@link DoubleValue} proxy.
     * 
     * @return a {@link DoubleValue} proxy on the created {@link Class}.
     */
    @objid ("dad267cf-ec9a-4e10-84be-23cfc6367ddb")
    public static DoubleValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME);
        return DoubleValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DoubleValue} proxy or <i>null</i>.
     */
    @objid ("2b4cf6ca-000e-4bdb-98d1-c74316ef33fc")
    public static DoubleValue instantiate(final Class obj) {
        return DoubleValue.canInstantiate(obj) ? new DoubleValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DoubleValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("188b340e-f4a8-40a3-b09a-100767826ac7")
    public static DoubleValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DoubleValue.canInstantiate(obj))
        	return new DoubleValue(obj);
        else
        	throw new IllegalArgumentException("DoubleValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f2b3ba19-12b4-4d66-9dc2-120b96f7acc1")
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
        DoubleValue other = (DoubleValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("328cf8a6-8cc2-4c07-a590-9c36e07658dd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cab514d6-227a-4113-8fc1-b8859d81a597")
    public String getValue() {
        return this.elt.getTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("35198074-ff36-48f3-b616-73ea3c04f5e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c8b4192c-63d1-4081-a443-6fcfbdf265c1")
    public void setValue(final String value) {
        this.elt.putTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("933fbcde-30a2-49ed-b7eb-42dfa93a6b47")
    protected DoubleValue(final Class elt) {
        super(elt);
    }

    @objid ("0478aee9-2727-4d68-be3a-307572bc0a9f")
    public static final class MdaTypes {
        @objid ("5f923ca9-58ac-4c89-8491-3ae1ad114bf4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d50508b1-a0a8-4f13-bda2-749834ad883b")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("d044c2a1-49d9-4f52-ab3a-cbc12c8c2207")
        private static Stereotype MDAASSOCDEP;

        @objid ("159749a3-a22a-4ae1-bfc4-3cdc6c1ba4c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab5e5c85-c2e7-4788-8236-96469e336a3d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f7f3c3b-3812-4284-9665-7696d52500f2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e0fd000-262b-4aa6-9b35-fea753d10683");
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
