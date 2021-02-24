using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Text;

namespace DataAccess.Abstract
{
    public interface ICarDal
    {
        List<Car> GettAll();

        void Add(Car car);  
        void Delete(Car car);
        void Update(Car car);
        List<Car> GettAllByBrand(int brandId);


    }
}
