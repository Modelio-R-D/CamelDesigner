/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
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
 * Proxy class to handle a {@link DataType} with << CompositeUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5225f72-6f20-48b4-a955-1025a1e63d7c")
public class CompositeUnit extends DimensionedUnit {
    @objid ("360811d5-9cbd-4506-9d48-43cc72aaa2ca")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("966aca37-0f12-4598-a0a4-0e51cee05df8")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CompositeUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("961f3ef9-80c3-4634-8ecb-4a242be5bdc3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CompositeUnit >> then instantiate a {@link CompositeUnit} proxy.
     * 
     * @return a {@link CompositeUnit} proxy on the created {@link DataType}.
     */
    @objid ("fd3546a4-df56-45f3-9eae-d51c59d82be9")
    public static CompositeUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME);
        return CompositeUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CompositeUnit} proxy or <i>null</i>.
     */
    @objid ("1329877a-dbb8-464f-a67d-9edae6e79b09")
    public static CompositeUnit instantiate(final DataType obj) {
        return CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CompositeUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3818a0d3-8c31-4738-809f-b0cbf78035e4")
    public static CompositeUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CompositeUnit.canInstantiate(obj))
        	return new CompositeUnit(obj);
        else
        	throw new IllegalArgumentException("CompositeUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("023fc57b-5ab8-424a-a8e3-84874e18dc0a")
    public void addComponentsUnits(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeUnit.MdaTypes.MDAASSOCDEP);
            d.setName("componentsUnits");
            d.putTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE, "componentsUnits");
        }
    }

    @objid ("35893690-335a-4e3b-a4d5-a8717af1b4d8")
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
        CompositeUnit other = (CompositeUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("92fff638-a1ab-4429-bd04-052f63872370")
    public List<Unit> getComponentsUnits() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "componentsUnits")
              && Unit.canInstantiate(d.getDependsOn()))
                results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Unit.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("4c7a274a-d396-43c3-9f50-ea3e4d158166")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a11e21e-aebc-49de-986a-f722a649899d")
    public String getFormula() {
        return this.elt.getTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("8cb76bc4-13ef-4016-a5fd-234d9f5b1767")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("67084364-a6ce-4f90-98ab-146a5d6fe8f0")
    public boolean removeComponentsUnits(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44f2f417-e575-40b4-a096-9b333f591362")
    public void setFormula(final String value) {
        this.elt.putTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    @objid ("f41e3c1f-d66c-4217-a5ae-6ad67bfe4d61")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("be7ef7a0-1b49-42f1-b2fd-399ae251a90e")
    protected CompositeUnit(final DataType elt) {
        super(elt);
    }

    @objid ("fb4ae2ef-3762-478f-83ef-6a6c6af48a4e")
    public static final class MdaTypes {
        @objid ("bda544b7-2a22-45b7-91db-a129cde84724")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b33035ae-dca4-4c43-a55a-1041c607f1f1")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("8a47d4c6-4e79-42ea-8245-e5a21528992b")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b6f31e9-eab4-47ae-a179-237ccf8f26e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ecbff29e-fbcc-4cd4-97ec-45cab755d1bd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "54731af6-c46a-4304-996c-2e03b9035567");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2bb36cd-c4c0-4f75-b9ed-ec821fa8774e");
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
