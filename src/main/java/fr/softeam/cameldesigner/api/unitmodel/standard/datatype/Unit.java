/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
 * Proxy class to handle a {@link DataType} with << Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad5e8f7b-b3a0-4678-bcf5-5ad638242927")
public abstract class Unit extends FeatureDataType {
    @objid ("cda766e5-9ca1-4483-9ef2-b80ca6d4734d")
    public static final String STEREOTYPE_NAME = "Unit";

    /**
     * Tells whether a {@link Unit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Unit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("090f4256-be5d-4e5c-bb95-e04710d3f82f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME));
    }

    @objid ("b4187319-dc53-4313-a5b9-108169109c29")
    public static Unit instantiate(final DataType obj) {
        return DimensionedUnit.canInstantiate(obj) ?  DimensionedUnit.instantiate(obj) : Dimensionless.canInstantiate(obj) ? new Dimensionless(obj) : null;
    }

    /**
     * Add a value of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5105dade-bff6-475f-ad75-de138b3fce15")
    public void addMultipleOf(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Unit.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("af6c113c-c419-4fc0-a784-3c7b875cfcd6")
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
        Unit other = (Unit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("ed6f6a3d-c615-4c9f-adf3-220726047ea5")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Get the values of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7b78e4d3-bd84-45ba-b031-c4890becaad2")
    public List<Unit> getMultipleOf() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), "")
              && Unit.canInstantiate(d.getImpacted())) {
                 results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getImpacted(), Unit.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d48d1aa7-2c70-40c0-b4f3-fbe4f373c44b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("63167aa9-2031-4acb-b47d-886c022ba6ab")
    public boolean removeMultipleOf(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("acb2e845-73b3-40db-9281-6b0c618e3a8c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("11e4bbcc-1eaa-476f-8eb9-6e7cf5565bbf")
    protected Unit(final DataType elt) {
        super(elt);
    }

    @objid ("6a12e779-f186-4ba1-ab98-47ecdcdb6ad2")
    public static final class MdaTypes {
        @objid ("84a11095-5cbd-4ce5-9c3e-65f1d1521f42")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5000579f-f641-4828-9d7a-60f0bc53209c")
        private static Stereotype MDAASSOCDEP;

        @objid ("74907cb0-a64c-4d37-80e0-3a10a46d6e55")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0d2b189f-2a6c-4be0-95ee-22504f72f2f6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "56c9f56b-274d-4816-80c8-72536d1d7295");
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
