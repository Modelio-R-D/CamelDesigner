/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

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
 * Proxy class to handle a {@link DataType} with << StringValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d4a116b7-cd26-400c-b04d-1c342f5d5ece")
public class StringValueType extends ValueType {
    @objid ("acc7bca1-ca0c-41fd-a9ea-2b4aba18fe3a")
    public static final String STEREOTYPE_NAME = "StringValueType";

    /**
     * Tells whether a {@link StringValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << StringValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d0b2bc2b-c5c6-4da5-bf15-7f7538d58c3e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << StringValueType >> then instantiate a {@link StringValueType} proxy.
     * 
     * @return a {@link StringValueType} proxy on the created {@link DataType}.
     */
    @objid ("9c80e383-fca8-490d-8a18-23162faadffd")
    public static StringValueType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, StringValueType.STEREOTYPE_NAME);
        return StringValueType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link StringValueType} proxy or <i>null</i>.
     */
    @objid ("17462623-e319-4ee3-afa7-2602593208cb")
    public static StringValueType instantiate(final DataType obj) {
        return StringValueType.canInstantiate(obj) ? new StringValueType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StringValueType} proxy from a {@link DataType} stereotyped << StringValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link StringValueType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c38d02a9-473d-43cd-a14a-e780267d4dea")
    public static StringValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (StringValueType.canInstantiate(obj))
        	return new StringValueType(obj);
        else
        	throw new IllegalArgumentException("StringValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d74d198-766e-467a-840b-623699502541")
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
        StringValueType other = (StringValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("cc431e2c-3bf3-4b5d-a3e4-7c25617d7c9e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("3b33257b-06d4-46ba-a293-c721aa04f39f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("417f82d6-6bb2-4286-b0d2-8b32d70fe465")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c5b1180c-aead-41f3-8fab-e72a7995a088")
    protected StringValueType(final DataType elt) {
        super(elt);
    }

    @objid ("a89d3bdc-f18a-481f-8114-f08ae25840a6")
    public static final class MdaTypes {
        @objid ("94af5cd0-d874-4c3f-b4bf-3bf6760a42da")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cacd038d-c70a-4247-9eb8-b6b859bc1444")
        private static Stereotype MDAASSOCDEP;

        @objid ("59b759b4-1e4d-4bba-941e-303588e4aeee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d5f78bc-c254-4142-87b7-557f1342e12a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c8a2299c-93cc-47ca-82f3-53c1866d2c5b");
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
