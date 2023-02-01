/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
 * Proxy class to handle a {@link DataType} with << BooleanValueType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2b62642-fe21-4f7c-a8c8-129bb3a99fab")
public class BooleanValueType extends ValueType {
<<<<<<< HEAD
    @objid ("a691b3fc-b9af-4ea3-b8a7-4f56972b9bf8")
=======
    @objid ("93f4faa3-657a-4b71-946f-118b88674a91")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "BooleanValueType";

    /**
     * Tells whether a {@link BooleanValueType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BooleanValueType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("b3c5019f-d398-4820-bac2-c0691e7922df")
=======
    @objid ("2f5d6140-e313-49d2-b255-93fd90bfa4e5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BooleanValueType >> then instantiate a {@link BooleanValueType} proxy.
     * 
     * @return a {@link BooleanValueType} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("ad7c17fc-bf33-44e1-8534-4906677a37a0")
=======
    @objid ("3a186092-f79a-49e1-b594-7488b6eda6ee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BooleanValueType create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BooleanValueType.STEREOTYPE_NAME);
        return BooleanValueType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link BooleanValueType} proxy from a {@link DataType} stereotyped << BooleanValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link BooleanValueType} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("e8a0979e-6994-44ad-800d-d917e283384f")
=======
    @objid ("73fbbfb4-7e76-4cc6-af83-158a326abb39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BooleanValueType instantiate(final DataType obj) {
        return BooleanValueType.canInstantiate(obj) ? new BooleanValueType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BooleanValueType} proxy from a {@link DataType} stereotyped << BooleanValueType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link BooleanValueType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("6b2c16d6-7d5e-428f-8ff7-8a6dab7bd056")
=======
    @objid ("4fe6127b-460d-49e1-b042-31ea3ad663e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BooleanValueType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BooleanValueType.canInstantiate(obj))
        	return new BooleanValueType(obj);
        else
        	throw new IllegalArgumentException("BooleanValueType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("2dfc1d35-1623-4325-b640-0a1f899cd505")
=======
    @objid ("92c393f2-d4d2-46dc-a72c-d4cc04ee45da")
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
        BooleanValueType other = (BooleanValueType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("a45f2d40-09e1-40ca-bc76-7a1fd37eaf2a")
=======
    @objid ("efaa543a-bf1d-49b9-a513-43364d4412b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("60fdd852-2ac9-408f-a26e-f5a9446baa5f")
=======
    @objid ("159e3ef5-4953-4a35-b3d5-a1bf7fd6f52d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("53a5e15e-b9c3-4095-9110-b259351cdea6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("a1bb8598-4d04-45d7-80a1-f1cceed04081")
=======
    @objid ("b2166dc9-5bd4-4185-b5e4-3b827fe0404f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected BooleanValueType(final DataType elt) {
        super(elt);
    }

    @objid ("df669cbd-dad5-4a9c-8f92-4f6b6714af23")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("bdbdfaf7-fbed-4f25-b823-a93e2ebfaa5f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d87c11d-2bb8-4d8e-be2b-870d53012aa2")
        private static Stereotype MDAASSOCDEP;

        @objid ("e220abdb-43b8-45ac-96b3-bdcd00961e5e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("097ebfa3-cf16-487d-be25-2a02aa33ae63")
=======
        @objid ("002a4f1d-2ff7-4ee6-a47d-c9ed0d05703c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2cccff5e-c83d-40b4-8329-c764db6374ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ab6d96b-0691-4752-9c55-7de7fbef719f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("61249d20-a7f2-4144-9959-5a815e71f501")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "34356c14-6f57-4377-8b6d-5f7e5d8b4929");
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
