/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << GeographicalRegion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class GeographicalRegion extends Location {
    public static final String STEREOTYPE_NAME = "GeographicalRegion";

    /**
     * Tells whether a {@link GeographicalRegion proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << GeographicalRegion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Enumeration} stereotyped << GeographicalRegion >> then instantiate a {@link GeographicalRegion} proxy.
     * 
     * @return a {@link GeographicalRegion} proxy on the created {@link Enumeration}.
     */
    public static GeographicalRegion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Enumeration");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME);
        return GeographicalRegion.instantiate((Enumeration)e);
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Enumeration
     * @return a {@link GeographicalRegion} proxy or <i>null</i>.
     */
    public static GeographicalRegion instantiate(final Enumeration obj) {
        return GeographicalRegion.canInstantiate(obj) ? new GeographicalRegion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GeographicalRegion} proxy from a {@link Enumeration} stereotyped << GeographicalRegion >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Enumeration}
     * @return a {@link GeographicalRegion} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GeographicalRegion safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (GeographicalRegion.canInstantiate(obj))
            return new GeographicalRegion(obj);
        else
            throw new IllegalArgumentException("GeographicalRegion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'parents' role.<p>
     * Role description:
     * null
     */
    public void addParents(final GeographicalRegion obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, GeographicalRegion.MdaTypes.MDAASSOCDEP);
            d.setName("enfant");
            d.putTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE, "enfant");
        }
    }

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
        GeographicalRegion other = (GeographicalRegion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}.
     * 
     * @return the Enumeration represented by this proxy, never null.
     */
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Get the values of the 'parents' role.<p>
     * Role description:
     * null
     */
    public List<GeographicalRegion> getParents() {
        List<GeographicalRegion> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), "enfant")
              && GeographicalRegion.canInstantiate(d.getImpacted())) {
                 results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getImpacted(), GeographicalRegion.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'parents' role.<p>
     * Role description:
     * null
     */
    public boolean removeParents(final GeographicalRegion obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(GeographicalRegion.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(GeographicalRegion.MdaTypes.MDAASSOCDEP_ROLE), "enfant"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    protected GeographicalRegion(final Enumeration elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b9be9f56-5f88-4cfb-8745-3fe2ceda1c86");
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
