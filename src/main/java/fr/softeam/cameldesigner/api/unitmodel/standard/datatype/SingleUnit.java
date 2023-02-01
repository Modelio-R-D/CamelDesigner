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
 * Proxy class to handle a {@link DataType} with << SingleUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7dfc6119-7128-437f-995f-47f0c2960c89")
public class SingleUnit extends DimensionedUnit {
<<<<<<< HEAD
    @objid ("1f3dc960-a397-463b-9768-2af5e2d6ba1f")
=======
    @objid ("94ffa476-a87b-4e3d-97f5-3f048856a1bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SingleUnit";

    /**
     * Tells whether a {@link SingleUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SingleUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("fc7052de-edf9-461b-9c82-5bf944a464ae")
=======
    @objid ("78b73d89-a358-4483-a516-abf22857f95b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << SingleUnit >> then instantiate a {@link SingleUnit} proxy.
     * 
     * @return a {@link SingleUnit} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("f446ee20-4ce5-4462-b2db-e2c0e177a8a4")
=======
    @objid ("6edf5719-65d9-4a3a-8d0b-c9180193658f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SingleUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME);
        return SingleUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link SingleUnit} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("cf6be67c-1d0a-4cbb-913b-40cb6c34ae4b")
=======
    @objid ("62160d9d-0fcf-4a65-bdb1-1ae6c2b925b8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SingleUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ? new SingleUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link SingleUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("dd4d6717-a1d0-4b69-b788-ebb89a046deb")
=======
    @objid ("8db91df9-65ea-4ed6-9efb-9bf4bdc64f88")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SingleUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SingleUnit.canInstantiate(obj))
        	return new SingleUnit(obj);
        else
        	throw new IllegalArgumentException("SingleUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("26b78017-a005-42f4-b6cb-50364464bec5")
=======
    @objid ("9c77b15b-2ebb-4159-aa43-dd548799610c")
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
        SingleUnit other = (SingleUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("5fadcea0-a81a-41ba-9e7c-738daa49a437")
=======
    @objid ("dec18243-ccbc-4a20-9f30-1f5b8ee68b3f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

<<<<<<< HEAD
    @objid ("90cd96b6-37f8-4a24-a3ba-6a3088ffaccd")
=======
    @objid ("f0c50489-ac6b-4f81-83a9-903442b4fb60")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d4eddff9-2c8e-44f5-a3b8-4b8052eb067a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("c705adf8-6c63-4514-b2d6-162af77c20de")
=======
    @objid ("0bc8d6c8-b662-40a6-9b51-f83c884c86a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SingleUnit(final DataType elt) {
        super(elt);
    }

    @objid ("41eab5b5-d30f-43d2-9da2-943d64381732")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("1bc44dec-a5ca-4315-9e4e-e241ed2ef5b2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88517c95-c5a9-42e3-9fca-5e584b61e836")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a857ea8-1c81-4911-9799-3af7d692fe3c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("367bd3c5-710f-4124-9094-14e653933ca5")
=======
        @objid ("75f7ccb1-e6c3-4c97-b7ef-a3ec5b090398")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b34f17f-8627-43da-abe5-7510190de4e0")
        private static Stereotype MDAASSOCDEP;

        @objid ("da6787d9-2cb5-4810-a6eb-61b4787175a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4e2359d-3646-44b7-8361-895bb38c7707")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5f6c0584-c6dd-44e5-a1ad-cd4785dccb03");
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
