/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("6a59f4d5-1f44-464a-a4f1-b6489ed19fc7")
    public static final String STEREOTYPE_NAME = "Unit";

    /**
     * Tells whether a {@link Unit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Unit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cca7e0b3-9d6b-4697-b8c1-a38179cd9974")
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
     */
    @objid ("141543f0-97cf-45c6-ab2a-60d933364b52")
    public void addMultipleOf(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Unit.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("8b7f5f1a-491d-4853-8bff-d90982a0d108")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("e610a3c3-bc99-4956-8b5f-374e86bdaeb5")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Get the values of the 'multipleOf' role.<p>
     * Role description:
     * null
     */
    @objid ("8cb4ce3b-3a9a-4595-a531-f7011122e41a")
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

    @objid ("d8187aa1-7164-4e60-aedb-d6d1dbb07e22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'multipleOf' role.<p>
     * Role description:
     * null
     */
    @objid ("121579c8-3a43-407f-a850-744036b9ff7d")
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

    @objid ("ad659243-8a89-4e7b-9ac3-e254e2afecad")
    protected Unit(final DataType elt) {
        super(elt);
    }

    @objid ("6a12e779-f186-4ba1-ab98-47ecdcdb6ad2")
    public static final class MdaTypes {
        @objid ("86b788b5-4699-466c-bc29-bff6657275ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c9f70b9-7025-4d08-a0d2-878e1a42db50")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb7dac9c-d502-4785-938f-e2f707b14f25")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7721ec0-598f-4bab-81f6-48a4615d5c06")
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
